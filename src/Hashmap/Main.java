package Hashmap;

public class Main {
    public static void main(String[] args) throws Exception {
       Hashmap<Integer, String> map = new Hashmap<Integer,String>();
       for(int i =1;i<Integer.MAX_VALUE;i++){
map.put(i, "Abrar");
       }
       System.out.println(map.size());
       System.out.println(map.keys());
       for(int i =1;i<=25/2;i++){
map.remove( i);
       }
        System.out.println(map.size());

        

        
      
         
    }
}
