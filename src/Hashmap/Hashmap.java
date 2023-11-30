package Hashmap;

import java.util.Arrays;

public class Hashmap<K,V> {
    private Object[] val;
     private Object[] key;
   private int size;
public Hashmap(){
   val = new Object[Integer.MAX_VALUE/5];
   key = new Object[Integer.MAX_VALUE/5];
   size = 0;
}
public void put(K k,V v) throws Exception{
    int hashCode = k.hashCode();
    if(val[hashCode-1] != null){
        throw new Exception("Two similar Key cannot be added!");
    }
    val[hashCode-1] = v;
    key[hashCode-1] = k;
    size++;

}
public V get(K k) throws Exception{
    int hashCode = k.hashCode();
    if(key[hashCode-1] == null){
        throw new Exception("Key not found Exception");
    }
    return (V)val[hashCode-1];
    

}
public void remove(K k) throws Exception{
    int hashCode = k.hashCode();
    if(key[hashCode-1] == null){
        throw new Exception("Key not found Exception");
    }
     val[hashCode-1] = null;
    key[hashCode-1] = null;
         size--;
}
public boolean contains(K k) throws Exception{
    if(isEmpty()){
                throw new Exception("Map is Empty");

    }
    int hashCode = k.hashCode();

    return key[hashCode-1] != null;

}
public boolean isEmpty() {
    for(int i =0;i<val.length;i++){
        if(val[i] != null){
            return false;
        }
    }
    return true;

}
public String keys() {
    String a = "";
    String t = "";
    for(int i =0;i<val.length;i++){
        if(key[i] != null){
           a = a + "\n " + t.valueOf(key[i]); 
    }
}
return a;
}
public String values() {
    String a = "";
    String t = "";
    for(int i =0;i<val.length;i++){
        if(val[i] != null){
           a = a + "\n " + t.valueOf(val[i]); 
    }
}
return a;

}
public int size() {
   return size;

}
public String toString(){
    String a = "{";
    String t = "";
    for(int i =0;i<val.length;i++){
        if(val[i] != null){
           a = a + "\n " + t.valueOf(key[i]) + " --> " + t.valueOf(val[i]); 
    }
}
    a = a + "\n}";
    return a;
}
}