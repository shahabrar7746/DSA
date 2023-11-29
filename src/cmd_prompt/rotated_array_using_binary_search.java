package cmd_prompt;

public class rotated_array_using_binary_search {
    //below method returns -1 if targeted element not found. if found then returns index of target
	//below code is solved using binary search
	static int search(int arr[],int target) {
		int max = 0;
		int pivotIndex =0;
		for(int i = 0;i<arr.length;i++) {
			if(max < arr[i]) {
				max = arr[i];
				pivotIndex = i;
			}
		}
		int strt = 0;
		int end = pivotIndex;
boolean isThere = true;
		if(arr[pivotIndex] == target) {
			return pivotIndex;
		}
		
		else {
			while(strt <= end) {
				int mid = strt+ (end - strt)/2;
				if(arr[mid] == target) {
					return mid;
				}if(arr[mid] < target) {
					strt = mid+1;
					isThere = false;
				}else {
					end = mid-1;
				}
			}
			
			strt = pivotIndex;
			end = arr.length-1;
			while(strt <= end) {
				int mid = strt+ (end - strt)/2;
				if(arr[mid] == target) {
					return mid;
				}if(arr[mid] < target) {
					strt = mid+1;
				}else {
					end = mid-1;
				}

			}
			
			
					}
		return -1;
		
	}
	static int inAsc(int target,int arr,int pivotIndex) {
		return -1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {81,83,85,87,90,71,73,75,77};
int target = 90;
System.out.println(search(arr,target));
	}

}
