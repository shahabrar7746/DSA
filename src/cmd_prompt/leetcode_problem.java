package cmd_prompt;

public class leetcode_problem {

	static char binary(char arr[],char target){
		int intArr[] = new int[arr.length];
		for(int i =0;i<arr.length;i++) {
			intArr[i] = arr[i];
		}
		int strt = 0;
		int end = arr.length-1;
		if(target > intArr[end]) {
			return arr[end];
		}
		if(target == arr[end]) {
			return arr[0];
		}
		while(strt <= end) {
 			int mid = strt + (end - strt) /2;

			if(target < intArr[mid]) {
				end = mid-1;
			}else {
				strt = mid+1;
			}
		}
		return (char)intArr[strt];


	}
	public static void main(String[] args) {

		char arr[] = {'c','f','j'};
		char target = 'c';
		System.out.println(binary(arr,target));
	}

}
