package cmd_prompt;
import java.util.*;
public class rank_transform {
	static public int[] arrayRankTransform(int[] arr) {
	       int ans[] = new int[arr.length];
	       int copy[] = new int[arr.length];
for(int i =0;i<arr.length;i++) {
	copy[i] = arr[i];
	}
Arrays.sort(copy);

	       for(int i =0;i<arr.length;i++){
	    		//System.out.println(arr[i] + " === " + copy[i] );

	       for(int j =0;j<arr.length;j++) {
	    	   if(arr[i] == copy[j]) {
	    		   ans[i] = j;
	    		   
	    	   
	    	   }
	       }
	       }
	       return ans;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {37,12,28,9,100,56,80,5,12};
		for(int i : arrayRankTransform(arr)) {
			System.out.println(i);
		}

	}

}
