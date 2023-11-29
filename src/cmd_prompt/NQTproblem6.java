package cmd_prompt;
import java.util.*;
public class NQTproblem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int size = sc.nextInt();
int arr[] = new int[size];
for(int i =0;i<size;i++) {
	arr[i] = sc.nextInt();
	
}
int pdt = 1;
int max =1;
for(int i =0;i+1<size;i++) {
	for(int j = i;j<size;j++) {
		pdt = pdt*arr[j];
		if(max < pdt) {
			max = pdt;
		}
		
	}
}
System.out.println( max);
}

}
