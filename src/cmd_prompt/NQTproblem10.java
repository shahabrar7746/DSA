package cmd_prompt;
import java.util.*;
public class NQTproblem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc = new Scanner(System.in);
           int size = sc.nextInt();
           int arr[] = new int[size];
           for(int i =0;i<size;i++) {
        	   arr[i] = sc.nextInt();
           }
           int result =0;
           for(int i =0;i<size;i++) {
        	   int count =0;
        	   for(int j =0;j<size;j++) {
        		   if(arr[i] == arr[j]) {
        			   count++;
        		   }
        	   }
        	   if(count == 1) {
        		   result++;
        	   }
           }
           System.out.println(result);
	}

}
