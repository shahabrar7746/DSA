package cmd_prompt;

import java.util.Scanner;

public class reverse_number {
public static int method(int n) {
	int modulus = 0;
	int ans =0;
	while( n > 0) {
		modulus = n%10;
		System.out.println(modulus);
		ans = ans * 10;
		System.out.println(ans + "---- ANS");
		ans = ans + modulus;
		System.out.println(ans + "------------ final ANS");
		n = n/10;
	}
	return ans;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		System.out.println(method(2300));
		
	}

}
