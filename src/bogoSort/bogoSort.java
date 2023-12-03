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
          
          
            while (!isSorted(arr)){
              
           
                int random1 = randomInt(arr.length);

                int random2 = randomInt(arr.length);
                if(random1 != random2){
                    int temp = arr[random1];
                    arr[random1] = arr[random2];
                    arr[random2] = temp;
                }
            }

         }
     public static void main(String[] args) {
        int arr[] = {4,3,2,1,-824,3,2,1};
        bogoSort(arr);
        System.out.println(Arrays.toString(arr));
     }
}