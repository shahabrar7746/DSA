package cmd_prompt;
import java.util.*;
public class palindrome {
	public static int palindrome(int a) {
		int result = 0;
		// temp = 0;
		int b = a;
		while(!(a <= 0)) {
			result = result*10+a%10;
			a = a/10;
			
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		while(cases != 0) {
			int num = sc.nextInt();
			if(num == palindrome(num)) {
				System.out.println("wins");
			}else {
				System.out.println("loses");
			}
			cases--;
		}

	}

}
