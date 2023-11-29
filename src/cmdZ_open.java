import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class cmdZ_open {
	public void excCommand(String new_dir){
	    Runtime rt = Runtime.getRuntime();
	    try {
	        rt.exec(new String[]{"cmd.exe","/c","start"});

	    } catch (IOException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
	}
	public static void main (String [] args) throws IOException {
		String[] command =
		    {
		        "cmd",
		    };
		    Process p;
			try {
				p = Runtime.getRuntime().exec(command);
			        new Thread(new SyncPipe(p.getErrorStream(), System.err)).start();
		                new Thread(new SyncPipe(p.getInputStream(), System.out)).start();
		                PrintWriter stdin = new PrintWriter(p.getOutputStream());
		                stdin.println("cd src\n javac Text.java\n java Text");
		               
		               
		               
		    	} catch (Exception e) {
		 		e.printStackTrace();
			}
	}

}
