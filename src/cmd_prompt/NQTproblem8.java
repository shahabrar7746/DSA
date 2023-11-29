package cmd_prompt;
import java.util.*;
public class NQTproblem8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int size = sc.nextInt();
int arr[] = new int[size];
for(int i = 0;i<size;i++) {
	arr[i] = sc.nextInt();
}
for(int i = 0;i<size;i++) {
	for(int j =0;j<size;j++) {
	//	System.out.println(arr[i] > arr[j]);
		if(arr[i] > arr[j]) {
			int temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
		}
	}
	for(int k : arr) {
		System.out.print(k + " ");
	}
	System.out.println();
}

	}

}
