package cmd_prompt;

import java.util.Scanner;

public class TestCases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
int arr[] = new int[N];
for(int i =0;i<N;i++) {
	arr[i] = sc.nextInt();
}
int n = arr.length; 
int ans = 0;
int temp = 0;  
 for(int i=0; i < n; i++){  
         for(int j=1; j < (n-i); j++){  
                  if(arr[j-1] > arr[j]){  
                         //swap elements  
                         temp = arr[j-1];  
                         arr[j-1] = arr[j];  
                         arr[j] = temp;  
                         ans++;
                 }  
                  
         }  
 }  
 if(ans != 1 && ans != 0) {
 System.out.println(ans-1);

 }else {
	 System.out.println(ans);
 }
	}

}
