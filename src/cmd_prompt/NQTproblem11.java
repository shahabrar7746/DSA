package cmd_prompt;
import java.util.*;
public class NQTproblem11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               Scanner sc = new Scanner(System.in);
               int size = sc.nextInt();
               int K = sc.nextInt();
               int arr2[] = new int[K];
               int arr[] = new int[size];
               for(int i =0;i<size;i++) {
            	   arr[i] = sc.nextInt();
               }
              for(int i = 1;i<=K;i++) {
            	  arr2[i-1] = arr[size-i];
            	 
              }
            for(int i = arr2.length-1;i>=0;i--) {
            	System.out.print(arr2[i] + " ");
            }
            for(int i = 0;i<size-K;i++) {
            	System.out.print(arr[i] + " ");
            }
               
	}

}
