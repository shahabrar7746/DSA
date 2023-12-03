package bogoSort;


import java.util.Arrays;
import java.util.Random;

public class bogoSort {
         static boolean isSorted(int arr[]){
            for(int i = 1;i<arr.length;i++){
                if(arr[i-1] > arr[i]){
                    return false;
                }
            }
            return true;
         }
         static int randomInt(int length){
            Random ran = new Random();
             return ran.nextInt(length);
         }
         static void bogoSort(int arr[]){
           int i = 1;
          
            while (!isSorted(arr)){
               if(i >= arr.length){
                i =0;
               }
           
                int r1 = i;
                int r2 = randomInt(arr.length);
                if(r1 != r2){
                    int temp = arr[r1];
                    arr[r1] = arr[r2];
                    arr[r2] = temp;
                }
            }

         }
     public static void main(String[] args) {
        int arr[] = {4,3,2,1,-824,3,2,1};
        bogoSort(arr);
        System.out.println(Arrays.toString(arr));
     }
}