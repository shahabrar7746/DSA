package cmd_prompt;

public class firstANDlast_Occurence {
 
	static int[] searchRange(int nums[],int target) {
		int ans[] = {-1,-1};
		ans[0] = search(nums,target,true);
		ans[1] = search(nums,target,false);

		return ans;
	}
	static int search(int arr[],int target, boolean isFirstIndex) {
		int ans = -1;
		
		int strt = 0;
		int end = arr.length-1;
		while(strt <= end) {
			int mid = strt + (end-strt)/2;
			if(target < arr[mid]) {
				end = mid-1;
			}else if(target > arr[mid]) {
				strt = mid+1;
			}else {
				ans = mid;
				if(isFirstIndex) {
					end = mid-1;
				}else {
					strt = mid+1;
				}
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int arr[] = {5,7,7,8,8,9,10};
 int target = 7;
for(int i : searchRange(arr,target)) {
	System.out.println(i);
}
	}

}
