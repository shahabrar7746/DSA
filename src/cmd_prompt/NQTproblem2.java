package cmd_prompt;

public class NQTproblem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String ip = "baaaaaaabaaaaaaaaaaaaaaaab";
int count = 0;
int max =0;
for(int i =0;i<ip.length();i++) {
	if(ip.charAt(i) == 'a') {
		count++;
		if(max < count) {
			max = count;
		}
	}else {
		count=0;
	}
}
System.out.println(max);
	}

}
