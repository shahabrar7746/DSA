package inheritance;

public class B extends A{

//@Override
public void greet() {
	
	System.out.println("In B. Overrided " +  A.class.getName());
}
public String toString() {
	return "B CLASS";
}
	

}
