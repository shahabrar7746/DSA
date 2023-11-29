package cmd_prompt;

public class NQTproblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int ip = 5244;
		int ans = 1;
		while(ip != 0) {
		
			int mod = ip%10;
			ans = ans*mod;
			
			ip =  ip/10;
			
		}
System.out.println(ans);
		
	}

}
