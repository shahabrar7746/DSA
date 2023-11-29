/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc = new Scanner(System.in);
	int cases = sc.nextInt();
	for(int i = 0;i<cases;i++) {
		int b = sc.nextInt();
		boolean isTail = true;
		String result = "Valid";
	
		sc.nextLine();
		String
		snake = sc.nextLine();
		char a = 'A';
		for(int j = 0;j<snake.length();j++) {
			
			if(!isTail) {
				//Incomplete
				if(a == 'H' | snake.charAt(j) == 'T') {
					a = 'T';
					result = "Invalid";
					isTail = false;
				}
				if(a == 'T' | snake.charAt(j) == 'H') {
					a = 'H';
					result = "Valid";
				}
			}
		if(snake.charAt(j) == 'H') {
				a = 'H';
				result = "Invalid";
				isTail = false;
			}if(snake.charAt(j) == 'T') {
				result = "Valid";
				a = 'T';
		}
			if(isTail) {
				result = "Invalid";
				break;
			}
			System.out.println(result);
		}
		System.out.println(result);
	}
	}
}
