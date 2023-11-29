// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> al = new ArrayList();
        boolean flag = true;
        for(int i =0;i<n;i++){
            for(int j = 1;j<n;j++){
                if(arr[i] == arr[j]){
                    flag = false;
                   // System.out.println(arr[j]);
                    al.add(arr[i]);
                }
            }
        }
//        if(flag){
//            al.clear();
//            al.add(-1);
//        }
        return al;
    }
}
