package countSort;

import java.sql.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.OptionalInt;

public class countSort {
    static int max(int arr[]){
        int max = arr[0];
        for(int i =1;i<arr.length;i++){
           if(max < arr[i]){
            max = arr[i];
           }
        }
        return max;
    }
    static void sort(int arr[]){
        int max = max(arr);
        int freq [] = new int[max+1];
             int pointer =0;
        for(int n : arr){
            freq[n]++;
        }
      
   for(int i =0;i<freq.length;i++){
     int f = freq[i];
            for(int k =0;k<f;k++){
              arr[pointer] = i;
              pointer++;
            }
   }
      
    }
     static void sortByMap(int [] arr){
         int max = max(arr);
       HashMap<Integer,Integer> map = new HashMap<>();
       
             
        for(int n : arr){
            map.put(n, map.getOrDefault(n,0)+1);
        }
      int pointer =0;
      int min = (Integer) Arrays.stream(arr).min().getAsInt();
         for(int i = min;i<=max;i++){
            int f = map.getOrDefault(i,0);
              for(int k =0;k<f;k++){
              arr[pointer] = i;
              pointer++;
            }
         }
      
       }

    public static void main(String[] args) {
        int arr[] = {3,4,1,3,2,5,243,8,3,90,43,23,23};
        sortByMap(arr);
        System.out.println(Arrays.toString(arr));
       
    }
    
}
