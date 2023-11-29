package exceptionHandling;

public class Main {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
String name = "Abrar";
if(name.equals("Abrar")) {
	throw new customException("My name is Abrar");
}
		}catch(customException e) {
			e.printStackTrace();
		}
	}
	static void error() throws Exception {
		throw new Exception("error has occured !");
	}
}
