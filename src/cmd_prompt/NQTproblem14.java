package cmd_prompt;
import java.util.*;
public class NQTproblem14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         int num = sc.nextInt();
         boolean isPrime = true;
         if(num == 0 | num == 1) {
        	 System.out.println(num + " is not Prime Number");
         }else {
        	 for(int i = 2;i<num/2;i++) {
        		 if(num%i == 0) {
        			 System.out.println(num + " is not a Prime Number");
        			 isPrime = false;
        			 break;
        		 }
        	 }
        	 if(isPrime) {
        		 System.out.println(num + " is a Prime Number");
        	 }
         }
	}

}
