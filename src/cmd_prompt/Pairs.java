package cmd_prompt;
import java.util.*;
public class Pairs {
	public int pairs(int k , List<Integer >arrs) {
		int ans = 0;
		for(int i = 0;i<arrs.size()-2;i++) {
			
			if(arrs.get(i) < arrs.get(i+1)) {
				if(arrs.get(i+1) - arrs.get(i) == k) {
					ans++;
				}
			}else {
				if(arrs.get(i) - arrs.get(i+1) == k) {
					ans++;
				}
				
			}
			}
			
			
		
		return ans;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
ArrayList<Integer> arr = new ArrayList()

;
arr.add(1);
arr.add(2);
arr.add(3);
arr.add(4);
arr.add(5);

 int a = new Pairs().pairs(1, arr);
 System.out.println(a);
	}

}
