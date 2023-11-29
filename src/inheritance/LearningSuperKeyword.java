package inheritance;

public  class LearningSuperKeyword {
	  class parentClass{
		 String name = "Abrar";
		
		public parentClass() {
			System.out.println("parentClass");
		}

		void show() {
			System.out.println("parentClass show();");
			
		}
	
	}
   class childClass extends parentClass{
	 String name = "Shaha";
	 childClass(){
		 super();
		 System.out.println("childClass");
	 }
	 	 void show() {
		System.out.println("childClass show();");
		System.out.println(name);//prints name variable from childClass.
		System.out.println(super.name);//prints name variable from parentClass using Super Keyboard.
      super.show();
	}
	 	
}
    void helper() {
		 new childClass();
	 }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LearningSuperKeyword().helper();
	}

}
