package cmd_prompt;

import java.util.Scanner;

public class PalindromeOfStarings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
String input =sc.nextLine();
StringBuilder build = new StringBuilder();
for(int i = input.length()-1;i>=0;i--) {
	build.append(input.charAt(i));
	
}
String output = build.toString();
if(input.equals(output)) {
	System.out.println("Palindrome");
}else {
	System.out.println("Not a Palindrome");
}

	}

}
