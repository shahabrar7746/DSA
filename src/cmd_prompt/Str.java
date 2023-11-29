package cmd_prompt;

import java.util.Arrays;

public class Str {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "Abrar.Shaha";

StringBuilder build = new StringBuilder();
for(int i =0;i<s.length();i++) {
	if(s.charAt(i) == '.') {
	build.append('#');	
	}else {
	build.append(s.charAt(i));
	}
}
s = build.toString();
String temp[];
temp = s.split("#");
	
System.out.println(Arrays.toString(temp));
	}

}
