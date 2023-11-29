import java.util.*;
public class CC2{
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
	 while(cases != 0) {
		
		 sc.nextLine();
		String ip = sc.nextLine();
		if(ip.contains("0") | ip.contains("5")) {
			System.out.println("YES");
			
		}else {
			System.out.println("NO");
		}
		cases--;
	 }
	}
}