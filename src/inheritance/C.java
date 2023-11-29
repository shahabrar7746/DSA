package inheritance;

public class C extends A {
        @Override
	public void greet() {
		System.out.println("In C. overrided " + A.class.getName());
	}

}
