

public class testingStack {

	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
   singleTon obj = singleTon.getInstance();
      singleTon obj1 = singleTon.getInstance();
               if(obj == obj1) {
            	   System.out.println(true);
               }
     
	}

}
