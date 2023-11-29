package lambdaFunctions;

import java.util.ArrayList;

public class functionClass {
	public static void main(String [] args) {
ArrayList<Integer> al = new ArrayList();
al.add(1);
al.add(2);
al.add(3);
al.add(4);
al.add(5);
al.add(6);
al.add(7);
al.forEach((item) -> System.out.println(item*item));
	}
}
