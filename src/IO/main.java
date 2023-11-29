package IO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;

public class main {
	public static void Main(String [] arg) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		int letters =	 isr.read();
			FileWriter write = new FileWriter(new File ("Not.txt"));
			write.append("\n new line has been added");
	
			FileReader fr = new FileReader("Not.txt");
			
	}

}
