package cmd_prompt;

import java.awt.Desktop;
import java.net.URI;

public class testings {

	 static void pad(String p,String up){
	        if(up.isEmpty()){
	            System.out.println(p);
	            return;
	        }
	        int digit = up.charAt(0) + '0';
	        for(int i = (digit -1 ) * 3;i<digit*3;i++){
	            char ch = (char) ('a' + i);
	            pad(p+ch,up.substring(1));
	        }
	    }
		  public static void main(String[] args)
		             throws Exception
		    {
		        Desktop desk = Desktop.getDesktop();
		        
		        // now we enter our URL that we want to open in our
		        // default browser
		        desk.browse(new URI("https://www.youtube.com/watch?v=qsme7Rk-fqQ&ab_channel=Facts%3AAlmasJacob%5BLIVE%5D"));
		    }

}
