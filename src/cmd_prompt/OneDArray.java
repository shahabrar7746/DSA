package cmd_prompt;
import java.util.*;
public class OneDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int queries = sc.nextInt();
for(int i = 0;i<queries;i++) {
	boolean isWin = false;
	int m = sc.nextInt();
	int n = sc.nextInt();
	int arr[] = new int[m];
	for(int j = 0;j<m;j++) {
		arr[j] = sc.nextInt();
		
	}
	for(int k = 1;k+1<m;k++) {
		//System.out.println(k);
		if(arr[k-1] == 0 | arr[k+1] == 0) {
			if(k+1+n <= m-1) {
				System.out.println("IN K+1 STATEMENT");
			if(arr[k-1] == 0 & arr[k+n-1] == 0) {
				isWin = true;
			}
			if(arr[k+1] == 0 & arr[k+1+n] == 0) {
				isWin = true;
			}
		}
		}
		if(k+n > m & k+1 == m-1 | arr[m-1] == 0 ) {
			isWin = true;
		}
		System.out.println(isWin);
	}
	if(isWin) {
		System.out.println("YES");
		isWin = false;
	}else {
		System.out.println("NO");
	}
	
}
	}

}
