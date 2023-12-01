package KarpAlbinAlgorithm;

public class searchStringinAnotherString {
    
    static boolean isFound(String s1, String s2){
        if(s1.equals(s2)){
            return true;
        }
        for(int i =0;i+s2.length()<=s1.length();i++){
            
           if(s2.hashCode() == s1.substring(i, i+s2.length()).hashCode()){//checks if s2 exists in  substring of s1 by comparing their hashCodes.
            String s3 = s1.substring(i, i+s2.length());
            for(int j = 0;j<s3.length();j++){//if hashCode are found to be equal then checks each char of s1 & s3.
                if(s2.charAt(j) != s3.charAt(j)){
                    return false;
                }
            }
            return true;// returns true if no any dissimilar char are found in s1 & s3.

           }
        }
        return false;//returns false if no hashCodes of s2 and substring of s1 are found similar
    }
    public static void main(String[] args) {
        //We are using Karp-Albin Algorithm, to check if s2 exists in s1. 

        System.out.println(isFound("Abrara","r"));
    }
}
