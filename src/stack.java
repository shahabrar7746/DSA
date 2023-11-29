
public class stack {
	private Node head;
	 public int size = 0;
 public void push(int data) {
	 
	 if(size == 0) {
		 pushFirst(data);
		 return;
	 }
	 
	 Node node = new Node(data);
	 node.next = head;
	 head = node;
	 size++;
	 
 }
 public void display() {
	 if(size != 0) {
		 Node node = head;
		 while(node != null) {
			 System.out.print(node.value + "->");
			 node = node.next;
		 }
		
	 }
	 System.out.println("END");
 }
 public boolean isEmpty() {
	 if(size == 0) {
		 return true;
	 }
	 return false;
 }
 public void  pop() throws Exception{
	 if(size  == 1) {
         		 
	 }
	 Node node = head;
	 if(node == null) {
		 new Exception("Null pointer ahead");
		
		 return;
	 }
	 head = node.next;
	 node.next = null;
	 size--;
	 
 }
 public int peek() {
	 if(size == 0) {
		 return -1;
	 }
	 return head.value;
 }
 private void pushFirst(int data) {
	 Node node = new Node(data);
	 node.next =null;
	head = node;
	size++;
 }
	
	
	private class Node{
       private Node next;
       private int value;
       
     
	public Node(int data) {
    	   this.value = data;
       }
       
		
		
		
	}

}
