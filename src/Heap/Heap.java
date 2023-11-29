package Heap;

import java.util.ArrayList;

public class Heap<T extends Comparable<T>> {
    public String info = "This heap is programmed for min value by default";
    private ArrayList<T> list ;
   public Heap(){
         list = new ArrayList<>();
         System.out.println(info);
    }
    public void sort() throws Exception{
         ArrayList<T> tmp = new ArrayList<>();
         while (!list.isEmpty()) {
            tmp.add(this.remove());
            
         }
         list = tmp;
    }
    public void add(T val) {
        list.add(val);
       upheap(list.size() -1);
        
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public T remove() throws Exception{
        if(list.size() == 0) {
            throw new Exception("Removin from empty heap");
        }
       
      T first = list.get(0);
      T last = list.remove(list.size()-1);
      if(!list.isEmpty()){
 list.set(0, last);
 downheap(0);
      }
       
       // upheap(list.size()-1);
      return first;  
    }
    
    public void show(){
        System.out.println(list);
    }
    private void upheap(int index){
        if(index == 0){
            return;
        }
        int p = parent(index);
        if(list.get(index).compareTo(list.get(p)) < 0){
            swap(index, p);
            upheap(p);
        }
    }
    private int parent(int index){
        return (index -1 )/2;
    }
    private void downheap(int index) {
        int min = index;
        int left = left(index);
        int right = right(index);
    
        if(left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
          min = left;
        }
    
        if(right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
          min = right;
        }
    
        if(min != index) {
          swap(min, index);
          downheap(min);
        }
      }
    private int left(int index){
        return index*2 + 1;
    }
    private int right(int index){
        return (index*2) +2;
    }
    private void swap(int first,int second){
        T temp = list.get(first);
        list.set(first,list.get(second));
        list.set(second,temp);
    }
   


}
