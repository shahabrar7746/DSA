package cmd_prompt;

public class binarySearch {
//This is the code for binary search in 1D array for Ascending order(generally can be editable for desending order as well
	static int search(int target,int[] arr) {
		int len = arr.length-1;
		int strt =0;
		int end= len;
		while(strt <= end) {
			int mid = (strt + end) /2;
			if(arr[mid] == target) {
                 return mid;
			}if(arr[mid] < target) {
				strt = mid+1;
				//end = mid-1;// ------> use for decending order
			}else {
				end = mid-1;
				//strt = mid+1;// ------> use for decending order
			}
				
		}
		return -1;
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int arr[] = {1,2,3,4,5,6,7,8,10};
		System.out.println(
           search(8,arr));
	}

}
