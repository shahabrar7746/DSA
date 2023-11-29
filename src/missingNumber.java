import java.util.*;
public class missingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	int arr[] = new int[size];
	for(int i =0;i<size;i++) {
		arr[i] = sc.nextInt();
	}
	Arrays.sort(arr);
	for(int i =0;i<size;i++) {
		if(i+1 != arr[i]) {
			System.out.println(i+1);
			break;
		}
	}

	}

}
