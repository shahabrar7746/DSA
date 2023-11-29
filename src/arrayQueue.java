import java.util.Arrays;

public class arrayQueue{
     private int[] data;
     private final static int DEFAULT_SIZE = 10;
      arrayQueue(){
      this(DEFAULT_SIZE);
     }
     int size = 10;
      arrayQueue(int size) {
    	
    	 this.data = new int[size];
    	 this.size = size;
    	
    	
     }
     private int pointer = 0;
     public void push(int data) throws Exception {
    	 if(pointer >= size) {
    		
    		 throw new Exception("Array Out off Bound");
    		 
    	 }
    	 this.data[pointer] = data;
    	 pointer++;
     }
     public void increSize(int size) {
    	 this.size = size;
    	 int i =0;
    	 int[] copy = new int[size];
    	 for(int x : data) {
    		 copy[i] = x;
    		 i++;
    	 }
    	 data = copy;
     }
     
     public void pop() throws Exception {
    	 if(pointer <= 0) {
    		 throw new Exception("Queue is Empty");
    	 }
    	 this.data[pointer-1] = -10;
    	 pointer--;
     }
     public void display() {
    	 for(int x : data) {
    		 if(x != 0 && x != -10) {
    			 System.out.print(x + " ");
    		 } 
    	 }
    	 System.out.println();
     }
     
		
		
		
	}
