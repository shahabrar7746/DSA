package cmd_prompt;
import java.util.*;
public class sortingAIRPORT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for(int i =0;i<size;i++) {
			arr[i] = s.nextInt();
		}

		for(int i =0;i<size;i++) {
			for(int j = 0;j<size;j++) {
				if(arr[j] > arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for(int i  : arr) {
			System.out.print(i + " ");
		}
	
	}

}
