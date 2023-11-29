
 package Heap;

 public class Main {

     public static void main(String[] args) throws Exception {
        Heap<Integer> p = new Heap();
        p.add(90);
       p.add(25);
        p.add(45);
        p.add(124);
        p.add(44);
        p.add(415);
        p.add(4585);
        p.add(450);
        while (!p.isEmpty()) {
         System.out.println(p.remove());
         
        }
     // p.sort();
     // p.show();
     }
}