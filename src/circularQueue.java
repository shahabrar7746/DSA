import java.util.Arrays;

public class circularQueue {
   private static final int DEFAULT_SIZE = 10;
	public circularQueue() {
		// TODO Auto-generated constructor stub
		this(DEFAULT_SIZE);
	}
	public int size;
	private int front = 0;
	private int end = 0;
	private int[] data;
	public circularQueue(int size) {
		this.size = size;
		front =0;
		end =0;
		this.data = new int[size];
	}
	private static int pointer = -1;
	public void  push(int data) throws Exception {
		if(!(pointer < size-1)) {
			throw new Exception("Array out off bound");
		}
		if(end >= size) {
			end = 0;
		}
		pointer++;
	
		this.data[end] = data;
		end++;
		
	}
	public void pop() throws Exception {
		if(pointer < 0) {
			throw new Exception("No element present to be removed");
		}
		front++;
		pointer--;
	}
	public void display() {
		if(front <= end) {
			for(int i = front;i<end;i++) {
				System.out.print(data[i] + " ");
			}
			System.out.println("");
			return;
		}
		System.out.println("IN DISPLAY");
		for(int i = front;i<size;i++) {
			System.out.print(data[i] + " ");
		}
		for(int i = end;i<=front;i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println(Arrays.toString(data));
	}
	

}
