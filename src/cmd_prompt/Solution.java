package cmd_prompt;

import java.util.*;
class Solution {
	//CEILING VALUE OF NUMBER USING BINARY SEARCH.
	
   static int ceiling(int arr[],int target) {
	   int strt = 0;
	   int end = arr.length-1;
	   if(target > arr[end]) {
		   return -1;
	   }
	   while(strt <= end) {
			int mid = strt + (end - strt) /2;

		   if(arr[mid] == target) {
			   return mid;
		   }
		   if(target < arr[mid]) {
			   end = mid-1;
		   }else {
			   strt = mid+1;
		   }
	   }
	  return strt;
   }
   public static int evaluatePostFix(String S)
   {
       // Your code here
       Stack<Integer> stack = new Stack<>();
       for(int i =0;i<S.length();i++){
       if(S.charAt(i) != '+' && S.charAt(i) != '-' && S.charAt(i) != '*' && S.charAt(i) != '/'){
    	  String temp = S.substring(i, i+1);
    	   int number = Integer.parseInt(temp);
           stack.push(number);
          
           
       }else{
           int B = stack.pop();
           int A = stack.pop();
           int num =0;
           if(S.charAt(i) == '-'){
               num = A - B;
           }
           if(S.charAt(i) == '+'){
               num = A+B;
           }if(S.charAt(i) == '*'){
               num = A*B;
           }if(S.charAt(i) == '/'){
               num = A/B;
           }
           stack.push(num);
       }    
           
       }
       return stack.pop();
   }
public static void main(String [] args) {
	int target = 4;
	System.out.println((int)'1');
	int arr[] = {1,3,5,7,9,11,13,15,17,19};
	System.out.println(ceiling(arr,target));
	System.out.println("FROM FIX"+evaluatePostFix("231*+9-"));
	
}
}