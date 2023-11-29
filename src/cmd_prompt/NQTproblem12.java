package cmd_prompt;
import java.util.*;
public class NQTproblem12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int size = sc.nextInt();
int arr[] = new int[size];
int sum = 0;
for(int i =0;i<size;i++) {
	arr[i] = sc.nextInt();
	sum = sum + arr[i];
	
}
System.out.println(sum/arr.length);
	}

}
