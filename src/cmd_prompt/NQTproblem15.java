package cmd_prompt;
import java.util.*;
public class NQTproblem15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner sc = new Scanner(System.in);
           int n = sc.nextInt();
           int a = sc.nextInt();
           int d = sc.nextInt();
           int sum = 0;
           for(int i = 0;i<n;i++) {
        	   sum = sum + a + i*d;
           }
           System.out.println(sum);
	}

}
