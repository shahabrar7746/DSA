import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    private List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        helper(arr, 0, 0, target, new ArrayList<>());
        return result;
    }
    boolean solved = false;
    private void helper(int arr[], int sum, int index, int target, ArrayList<Integer> list){
        if(equalsTarget(target, list)){
            return;
        }
if(arr[index] + sum > target){
    return;
}
        for(int i = index;i< arr.length;i++){
            list.add(arr[i]);
          helper(arr, arr[i] + sum, i, target, list);
            System.out.println(list);
            System.out.println(sum);
        }

    }
    private boolean equalsTarget(int target, List<Integer> list){
        int sum = 0;
        for (int val : list){
            sum += val;
        }
        return sum == target;
    }
    public static void main(String[] args) {
        System.out.println(new CombinationSum().combinationSum(new int[]{2,3,6,7}, 7));
    }
}
