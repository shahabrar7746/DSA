package cmd_prompt;
import java.util.*;
public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String day = s.nextLine();
		
int days = s.nextInt();
int toAdd =0;
String arr[] = {"mon","tue","wed","thu","fri","sat","sun"};
for(int i = 0;i<7;i++) {
	if(day.equals(arr[i])) {
		toAdd = i +1;
		break;
	}
}
int result =0;
for(int i = 1;i<=days+toAdd;i++) {
	if(i%7==0) {
		result++;
	}
}
System.out.println(result);
	}

}
