package cmd_prompt;
import java.util.*;
public class NQTProblem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int size = sc.nextInt();
int D = sc.nextInt();
int arr[] = new int[size];
int temp[] = new int[D];
for(int i =0;i<size;i++) {
	arr[i] = sc.nextInt();
}
for(int i =0;i<D;i++) {
	temp[i] = arr[i];
}
int templc = 0;
for(int i = D;i<size;i++) {
	arr[templc] = arr[i];
     templc++;
}
templc =0;
for(int i = size-D;i<size;i++) {
	arr[i] = temp[templc];
	templc++;
}
for(int i : arr) {
	System.out.print(i + " ");
}
	}

}
