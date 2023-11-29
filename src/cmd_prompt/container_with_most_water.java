package cmd_prompt;

public class container_with_most_water {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//URL for problem
		//https://leetcode.com/problems/container-with-most-water/
		int arr[] = {1,1};
		int len = arr.length;
		int max =0;
		int maxIndex = 0;
		int toBe = 0;
		for(int i =0;i<len;i++) {
			if(max < arr[i]) {
				max = arr[i];
				System.out.println("i -----> " + i);
				maxIndex = len-i;
				System.out.println(maxIndex);
			}
		}
		maxIndex -= 1;
		
		System.out.println(maxIndex*arr[len-1]);
	}

}
