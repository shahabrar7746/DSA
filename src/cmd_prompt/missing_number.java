package cmd_prompt;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

public class missing_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {7,8,9,10,11};
		int len = arr.length;
		int i =0;
		while(i < len) {
			int crt = arr[i]-1;
			if(arr[i] >0 && arr[i] <= len && arr[i] != arr[crt]) {
				int temp = arr[crt];
				arr[crt] = arr[i];
				arr[i] = temp;
			}else {
				i++;
			}
		}
				
		System.out.println(Arrays.toString(arr));
		for(int j =0;j<len;j++) {
			if(j+1 != arr[j]) {
               System.out.println(j+1);
               break;
			}
		}
	}

}
