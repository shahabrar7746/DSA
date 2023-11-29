package cmd_prompt;

public class position_of_an_element_in_infinite_array {

	static int binary(int index,int endIndex,int arr[],int target) {
		for(int i = index;i<=endIndex;i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		return -1;
		
	}
	static int findIndex(int arr[],int target) {
		int i = 0;
		int j = 1;
		int windowSize = 1;
		while(true) {
			
			windowSize++;
			if(target < arr[j]) {
				break;
			}else {
				i += windowSize;
				j += windowSize;
			}
		}
		return binary(i,j,arr,target);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int arr[] = {1,2,3,4,5,6,7,8,9};
            int target = 9;
            System.out.println(findIndex(arr,target));
	}

}
