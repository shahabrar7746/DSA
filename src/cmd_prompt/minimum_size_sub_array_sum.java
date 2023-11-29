package cmd_prompt;

public class minimum_size_sub_array_sum {
	 public static int minSubArrayLen(int target, int[] nums) {
		 int arrLen = 0;
		 int tempAns =0;
		 for(int i =0;i<nums.length;i++) {
			 int temp =0;
			 if(nums[i] >= target) {
				 tempAns++;
			 }
			 for(int j =i;j<nums.length;j++) {
				 temp = temp + nums[j];
				 if(temp >= target) {
					 arrLen++;
					if(tempAns < arrLen) {
						arrLen = tempAns;
					}
				 }
			 }
		 }
if(arrLen != 0) {
	return arrLen;
} 
return 0;

	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = {2,3,1,2,4,3};
int target = 7;
System.out.println(minSubArrayLen(target,arr));
	}

}
