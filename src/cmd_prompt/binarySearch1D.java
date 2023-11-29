package cmd_prompt;

public class binarySearch1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//learnt from below URL
		//https://youtu.be/f6UU7V3szVw?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ
		//int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int arr[] = {10,9,8,7,6,5,4,3,2,1,0};
		int size = arr.length;
		int target = 2;
		System.out.println(binary(arr,target));
	}
	static int binary(int arr[],int target) {
		int strt = 0;
		int end = arr.length;
		boolean isAsc = arr[0] == arr[arr.length-1];//checks the order of the Array
		
		while(strt <= end) {
			int mid = strt + (end - strt) /2;
			if(arr[mid] == target) {
				return mid;
			}
			//below IF will be called if the Array is in Descending order

			if(isAsc) {
			if(target < arr[mid]) {
				end = mid-1;
			}else {
				strt = mid +1;
			}	
			}
			//else will be called if the Array is in Descending order

			else {

				if(target > arr[mid]) {
					end = mid-1;
				}else {
					strt = mid +1;
				}	
			}
		}
		return -1;
	}
	}
