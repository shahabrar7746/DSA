package cmd_prompt;

import java.util.Arrays;

public class intersection_of_two_array {
	 static int recursive(int n){
	        if(n == 6){
	        System.out.println(n);
	            return n;
	        }
	        recursive(n+1);
	       return 1;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr1[] = {1,2,2,1}
;
int arr2[] = {2,2};
int len1 = arr1.length;
int len2 = arr2.length;
Arrays.sort(arr1);
Arrays.sort(arr2);
int n =1;
recursive(n);
System.out.println(recursive(n));
	}

}
