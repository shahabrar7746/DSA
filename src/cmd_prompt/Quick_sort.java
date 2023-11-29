package cmd_prompt;

import java.util.Arrays;

public class Quick_sort {
	static int count =0;
static void sort(int arr[],int low,int hi) {
	if(low >= hi) {
		return;
	}
	int s = low;
	int e = hi;
	int mid = (s+e)/2;
   int pivot = arr[mid];
   while(s<=e) {
	   while(arr[s] < pivot) {
		   s++;
	   }while(arr[e] > pivot) {
		   e--;
	   }
	   if(s<=e) {
		   int temp = arr[s];
		   arr[s] = arr[e];
		   arr[e] = temp;
		   s++;
		   e--;
		   count++;
	   }
   }
   //after above lines. the pivot will be at it's correct position.
   sort(arr,low,mid-1);
   sort(arr,s,mid+1);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,9,8,7,6,5,4,3,2,1};
		System.out.println("This is an example of quick sort");
		System.out.println("For explanation watch this video :- https://youtu.be/Z8svOqamag8?list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ"  );
System.out.println("Before sorting :- " + Arrays.toString(arr));
sort(arr,0,arr.length-1);//<----------This method is used for Sorting the array in the decending order
System.out.println(count/2);
		System.out.println("After sorting :- "+Arrays.toString(arr));

	}

}
