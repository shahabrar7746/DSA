package twoPointers;

public class problem {
    
 
    private int Countpair(int arr[], int n, int sum)
{
    // Complete the function
    int count =0;
    for(int i =0;i+1<n;i++){
        if(isSame(sum,i,arr)){
            count++;
        }
    }
    if(count == 0){
    return -1;
    }
    return count;
}
private boolean isSame(int sum,int i,int arr[]){
  
  int right = arr.length-1;
   while(right != i){
       if(arr[right] + arr[i] == sum){
           return true;
       }else{
           right--;
       }
   }
   return false;
} final private  int sampleAnswer = 8;
final private int sampleSum = 7;
      final public String complexity = "Time  complexity : O(N), space complexity O(1)";
       final public String problemTitle = "Pair with given sum in a sorted array";
    final public String problemURL = "https://www.geeksforgeeks.org/problems/pair-with-given-sum-in-a-sorted-array4940/1?page=1&category=two-pointer-algorithm&status=solved&sortBy=submissions";
final public String problemStatement = "You are given an array Arr of size N. You need to find all pairs in the array that sum to a number K. If no such pair exists then output will be -1. The elements of the array are distinct and are in sorted order.\r\n" + //
        "Note: (a,b) and (b,a) are considered same. Also, an element cannot pair with itself, i.e., (a,a) is invalid.";
      final  public String sampleInputs = "Array = {1, 2, 3, 4, 5, 6, 7},\n Sum : " + 7 + ",\n " + " Obtained Answer : " + 8 + " }";
       
                 



        public void test(){
            int arr[] = {1,2,3,4,5,6,7};
            System.out.println(Countpair(arr,arr.length,7));
        }
        public static void main(String[] args) {
            problem p = new problem();
            p.test();
        }
}

