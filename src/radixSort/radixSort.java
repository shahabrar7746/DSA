package radixSort;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class radixSort {
    
 static void radixSort(int arr[]){
      int max = Arrays.stream(arr).max().getAsInt();
      int xpo = 10;
      int ref[] = arr.clone();
      int freq[] = new int[10];
      for (int j = 1;max/j>0;j *= 10) {
         
       
         // System.out.println(Arrays.toString(freq));
          countSortForRadix(arr,j);
        
       // xpo *= 10;
        
        
      }
   
// System.out.println(Arrays.toString(ref));
 }
 static void countSortForRadix(int[] arr,int exp ){
    int n = arr.length;
    int[] output = new int[n];
    int[] count = new int[10];

    Arrays.fill(count, 0);

    for(int i=0; i<n; i++) {
      count[(arr[i] / exp) % 10]++;
    }

    System.out.println("\nCount array for " + exp + " : " + Arrays.toString(count));

    for(int i=1; i<10; i++) {
      count[i] = count[i] + count[i-1];
    }

    System.out.println("Updated count array " + Arrays.toString(count));

    for(int i=n-1; i>=0; i--) {
      output[count[(arr[i] / exp) % 10] - 1] = arr[i];
      count[(arr[i] / exp) % 10]--;
    }

    System.out.println("Output array " + Arrays.toString(output));
    
    System.arraycopy(output, 0, arr, 0, n);
 }
    
    public static void main(String [] args){
        int arr[] = {1,2,4,3,5555,610};
      radixSort(arr);
                   System.out.println(Arrays.toString(arr));

    }
}