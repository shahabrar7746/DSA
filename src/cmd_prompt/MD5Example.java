package cmd_prompt;
import java.math.BigInteger; 
 

import java.security.MessageDigest;  
import java.security.NoSuchAlgorithmException;  
public class MD5Example  
{  
//hash function to get the md5 hash  
public static String getMd5Hash(String input)  
{  
try   
{  
//static getInstance() method is called with hashing MD5  
MessageDigest md = MessageDigest.getInstance("SHA-256");  
//calculating message digest of an input that return array of byte  
byte[] messageDigest = md.digest(input.getBytes());

//converting byte array into signum representation  
BigInteger no = new BigInteger( messageDigest);
//System.out.println("BIGINT --> " + no);
//converting message digest into hex value  
String hashtext = no.toString(16);
//System.out.println("HT -->" + hashtext);
while (hashtext.length() < 32)   
{  
hashtext = "0" + hashtext;  
}  
return hashtext;  
}  
//for specifying wrong message digest algorithms  
catch (NoSuchAlgorithmException e)   
{  
throw new RuntimeException(e);  
}  
}
public static int recurse(int n) {
	n -= 1;
	if(n == 1) {
		return 0;
	}
	return recurse(n);
}
//driver code  
public static void main(String args[]) throws NoSuchAlgorithmException  
{  
String s = "HelloWorld";  
//System.out.println("HashCode Generated for the string is: " + getMd5Hash(s));

System.out.println(recurse(100));
}  
}  