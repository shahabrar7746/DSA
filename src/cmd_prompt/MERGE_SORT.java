package cmd_prompt;
import java.util.*;
public class MERGE_SORT {
static int count =0;
	static int[] mergeSort(int arr[]) {
		//This function will divide and the sort the both array;
		if(arr.length == 1) {
			return arr;
		}
		int mid = arr.length/2;
/**This wil store left hand side of sorted array*/		int left[] = mergeSort(Arrays.copyOfRange(arr, 0, mid));
/**This wil store right hand side of sorted array*/		int right[] = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
		

		return merge(left,right,arr);

	}
	private static int[] merge(int[] left, int[] right,int arr[]) {
		//This is a helper funtion for mergeSort 
		/**This function will merge both Arrays into arr Array**/
		int i =0;
		int j =0;
		int k =0;
		while(i<left.length && j<right.length) {
			if(left[i] < right[j]) {
				arr[k] = left[i];
				i++;
			}else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		while(i<left.length) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while(j<left.length) {
			arr[k] = right[j];
			j++;
			k++;
		}
		count++;
		// TODO Auto-generated method stub
		return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {2,4,1,3,5};
System.out.println("Un sorted Array :- "+Arrays.toString(arr));
mergeSort(arr);
String s = "";

System.out.println("You are using Merge Sort via recursion"+"\nSorted Array :- "+Arrays.toString(arr));
	}

}
