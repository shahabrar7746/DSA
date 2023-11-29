package cmd_prompt;
import java.util.*;
public class longest_substring_without_repeating_characters {
/*
 * URL for the problem is given below.
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
static int lengthOfLongestSubstring(String s) {
        int ans = 0;
		  String temp= "";
		  if(s.equals(" ") | s.length() == 1) {
			  return 1;
		  }
		  if(s.equals("")) {
			  return 0;
		  }
			  
        for(int i =0;i<s.length();i++) {
        	for(int j =0;j<s.length();j++) {
        		System.out.println(s.substring(i, j) + "SUNSTRING");
        		if(isRepeatetive(s.substring(i, j))){//this if is executed if no repeatetive character is found in substring
        			temp = s.substring(i, j);

        		  if(temp.length() > ans) {
        			  //This condition checks if the previous Substring has more number of character or not
        			  //if yes then it will new value to ans varibale
        			  ans = temp.length();
        		  }
        		}
        	}
        }
//        if(ans == 0) {
//        	ans =1;
//        }
       return ans;        
}
//this methods checks if a sub-strings has a repeatetive chararcter or not

	static boolean isRepeatetive(String s) {
		boolean ans = true;
		HashSet<Character> hs = new HashSet();
		for(int i =0;i<s.length();i++) {
			hs.add(s.charAt(i));
					}
		if(hs.size() != s.length()) {
			ans = false;
		}
		

		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println(lengthOfLongestSubstring("c"));
	}

}
