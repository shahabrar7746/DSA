package Hashmap;

public class Main {
    public static void main(String[] args) throws Exception {
       Hashmap<Integer, String> map = new Hashmap<Integer,String>();
       for(int i =1;i<25;i++){
map.put(i, "Abrar");
       }
        

        
      System.out.println(map.get(2));
        System.out.println(map.isEmpty());
       System.out.println(map);
        System.out.println(map.isEmpty());
         
    }
}
