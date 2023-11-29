import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class stringIntro {

    // Complete the substrCount function below.
	static boolean isPalindrome(String s) {
	
		String ans = "";
		for(int i = s.length()-1;i>=0;i--) {

			String temp = "";
			ans = ans + temp.valueOf(s.charAt(i));
		}
		return s.compareTo(ans) == 0;
	}
    static long substrCount(int n, String s) {
long ans =0;
for(int i =0;i<s.length();i++) {
	for(int j =0;j<s.length();j++) {
		if(isPalindrome(s.substring(i, j))) {
			ans++;
		}
	}
}



return ans;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        scanner.nextLine();
        String s = scanner.nextLine();
        System.out.println(substrCount(n,s));
        
    }
}
