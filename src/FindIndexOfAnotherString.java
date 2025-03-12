public class FindIndexOfAnotherString {
    public static  int strStr(String haystack, String needle) {
     if(!haystack.contains(needle)){
         return -1;
     }
     for(int i =0;i + needle.length() <= haystack.length();i++){
         String str = haystack.substring(i, i+needle.length());
         System.out.println(str);
         if(str.equals(needle)){
             return i;
         }
     }
     return -1;
    }
    public static void main(String[] args) {
        System.out.println(strStr("abc", "c"));
    }
}
