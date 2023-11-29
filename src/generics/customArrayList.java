package generics;

import java.util.Arrays;

public class customArrayList<E> implements genericInterface<E> {
	private int size = 0;
	private static int DEFAULT_SIZE = 10;
	 private Object arr[];
	 customArrayList(){
		 size = 0;
		 arr = new Object[DEFAULT_SIZE];
	 }
	 customArrayList(int size) {
		 arr = new Object[size];
	 }
	 private boolean isFull() {
		 return size == arr.length;
	 }
	 private void resize() {
		 Object[] temp = new Object[size * 2];
		 for(int i = 0;i<size;i++) {
			 temp[i] = arr[i];
		 }
		 arr = temp;
	 }
	 public void add(E item) {
		 if(isFull()) {
			 resize();
		 }
		 arr[size++] = item;
		 
	 }
	 public E remove() {
		 E removed = (E) arr[size--];
		 return removed;
	 }
	 public E get(int index) {
		 return (E) arr[index];
	 }
	@Override
	public String toString() {
		return "customArrayList [arr=" + Arrays.toString(arr) + "]";
	}
	 public int size() {
		 return size;
	 }
	 
	 public boolean equals(customArrayList<E> list) {
		 String currentObject = this.toString();
		 
		 String objectString = list.toString();
		 
		 return currentObject.equals(objectString);
		 
		
	 }
	 @Override
	public boolean areSame(customArrayList<E> object) {
		
		return object.hashCode() == this.hashCode();
	}
	
	

}
