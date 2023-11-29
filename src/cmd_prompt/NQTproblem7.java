package cmd_prompt;
import java.util.*;
public class NQTproblem7 {
public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
int []arr = new int[size];
for(int i =0;i<size;i++) {
	arr[i] = sc.nextInt();
}int occuring =0;
for(int i =0;i<size;i++) {
	for(int j =0;j<size;j++) {
		if(i+1 == arr[j]) {
			occuring++;
		}
	}
	System.out.print(occuring + " ");
	occuring =0;
}

   }
}
