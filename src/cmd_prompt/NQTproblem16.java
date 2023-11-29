package cmd_prompt;
import java.util.*;
public class NQTproblem16{
	static int numDigit(int num) {
		int ans = 0;
		while(num != 0) {
			ans++;
			num = num/10;
		}
		return ans;
	}
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	int max = 0;
	
	int index = 0;
	int rows = sc.nextInt();
	int cols = sc.nextInt();
	int arr[][] = new int[rows][cols];
	for(int i =0;i<rows;i++) {
		int add = 0;
		for(int j =0;j<cols;j++) {
		arr[i][j] = sc.nextInt();
		add = add + arr[i][j];
	}
		if(max < add) {
			max = add;
			index = i;
		}
	}
	
	if(max == 0) {
		System.out.println("Array is empty");

	}else {
		System.out.println(max + " is maximum wealth ");

	}
	}
}