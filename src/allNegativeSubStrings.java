import java.util.*;
public class allNegativeSubStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
int arr[] = new int[size];
for(int i =0;i<size;i++) {
	arr[i] = sc.nextInt();
}
int count =0;
for(int i =0;i<arr.length;i++) {
	int negative =0;
	for(int j =i;j<arr.length;j++) {
		negative += arr[j];
if(negative < 0) {	
	
	count++;
}
	}
}
System.out.println(count);

	}

}
