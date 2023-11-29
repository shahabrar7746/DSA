
import java.util.*;
class Main {
  public static void main(String[] args) {
 
	  LinkedList<Integer> q2 = new LinkedList<Integer>();
	  ArrayList<Integer> list = new ArrayList<>();
	  list.t
    System.out.println(reverseWords(""));
  }
  static String reverseWords(String S)
  {
	  String ans = "";
	  Stack<Character> stk = new Stack();
	  for(int i =0;i<S.length();i++) {
		 stk.push(S.charAt(i));
	  }
	  while(!stk.isEmpty()) {
		  ans = ans + stk.pop();
	  }
	  return ans;
      // your code here
  }
   public static String longestPalindrome(String s) {
         ArrayList<String> al = new ArrayList();
         
         int max = 0;
         String str = null;
        for(int i =0;i<s.length();i++){
            for(int j = i;j<=s.length();j++){
               if(isPalindrome(s.substring(i,j))){
                  //al.add(s.substring(i,j));
                  if(max < s.substring(i,j).length()) {
                	  max = s.substring(i, j).length();
                	  str = s.substring(i, j);
                  }
               }      
            }
        }
                       for(int i = 0;i<al.size();i++){
                      if(max < al.get(i).length()){
                          max = al.get(i).length();
                          str = al.get(i);
}
                  }
     return str;
    }
  
   static boolean isPalindrome(String s){
      int lct = s.length()-1;
        for(int i =0;i<s.length()/2;i++){
          if(s.charAt(i) != s.charAt(lct-i)){
              return false;
          }
}
        return true;
    }
}
