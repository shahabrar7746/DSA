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
          int c = 1;
            while (!isSorted(arr)){
              
           System.out.println(c++);
                int random1 = randomInt(i);

                if(i >= arr.length){
                    i = 1;
                }
                if(random1 != i){
                    int temp = arr[random1];
                    arr[random1] = arr[i];
                    arr[i] = temp;
                    i++;
                }
            }

         }
     public static void main(String[] args) {
        int arr[] = {4,3,2,1,-824,45,4,54,5,40,25,-1,34,24,91450,1,3251,5424};
        bogoSort(arr);
        System.out.println(Arrays.toString(arr));
     }
}