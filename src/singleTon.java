
public class singleTon {

	private singleTon() {
		// TODO Auto-generated constructor stub
	}
	private static singleTon instance;
	public static singleTon getInstance() {
		if(instance == null) {
			instance = new singleTon();
		}
		return instance;
	}

}
