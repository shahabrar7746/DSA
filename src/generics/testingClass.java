package generics;

public class testingClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
customArrayList<Integer> list = new customArrayList();
list.add(12)

;
customArrayList<Integer> lis2t = list;


;
System.out.println(list.equals(lis2t));
System.out.println(list.areSame(lis2t));
System.out.println(list);
System.out.println(lis2t);
	}

}
