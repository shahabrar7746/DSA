package linkedList;
//Doubly_LL stands for Doubly Linked list. taught by Kunal khushwaha 
//link : https://www.youtube.com/watch?v=58YbpRDc4yw&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=45&ab_channel=KunalKushwaha
public class Doubly_LL {
private Node head;
private Node tail;
	public int size;
	public Doubly_LL() {
		size=0;
	}
	public void display() {
		Node temp = head.next;
		while(temp != head) {
			System.out.print(temp.data+" -> ");
			
			temp = temp.next;
		}
		System.out.println("END");
		
	}
	public Node get(int index) {
		Node temp = head;
		for(int i =1;i<index;i++) {
			temp = temp.next;
		}
		return temp;
	}
	public void insertAt(int value,int index) {
		Node node = get(index);
		Node node2 = new Node(value,node.next,node.prev);
		node.next = node2;
		node2.prev = node;
		size++;
		
	}
	public  Node sortedInsert(int data)
    {
       //add code here.
       
       if(data <= head.data){
           Node node = new Node(data);
           Node temp = head.next;
           head.next = node;
           node.next = temp;
           return head;
       }
       Node node = new Node(data);
       Node second = head.next;
       while(second != head && second != null){
           if(second.data < data && data <= second.next.data){
               Node temp = second.next;
               second.next = node;
               node.next = temp;
               return head;
           }
           second = second.next;
           
       }
       second.next = node;
       node.next = head;
       return head;
       
    }
	public void insertLast(int value) {
		insert(value);
		
		
		
	}
	public int ValueAt(int index) {
		Node node = get(index);
		return node.data;
	}
	public void insert(int value) {
		if(size == 0) {
			insertFirst(value);
			return;
		}
		Node temp = head;
		Node last = temp;
		while(temp != null) {
		//	System.out.print(temp.value+" -> ");
			last = temp;
			temp = temp.next;
		}
		Node node = new Node(value);
		
		last.next = node;
		node.prev = last;
		node.next = null;
		
		last = node;
		tail = node;
		
		
		size++;
	}
	public void reversal() {
		Node temp = tail;
	
		while(temp != null) {
			System.out.print(temp.data + " <- ");
			temp = temp.prev;
		}
		System.out.println("START");
		
		
	}
      public void deleteFirst() {
    	  Node node = head.next;
    	  node.next = head.next.next;
    	  node.prev = null;
    	  head = node;
    	  size--;
    	  
      }
	public void delete(int index) {
		if(index == 1) {
			deleteFirst();
		}
		Node node = get(index-1);
		node.next = node.next.next;
	size--;
		node.next.next.prev = node; 
	}
	public void insertFirst(int value) {
		size++;
		Node node = new Node(value);
		node.next = head;
		node.prev = null;
		if(head != null) {
			head.prev = node;
		}
		head = node;
		if(tail == null) {
			tail = head;
		}
		
	}
	public void deleteLast() {
		Node node = tail.prev;
		node.next = null;
		node.prev = tail.prev.prev;
		tail = node;
		size--;
	}
	private class Node {
		private int data;
		private Node next;
		private Node prev;
		public Node(int value) {
			this.data =value;
		}
		public Node(int value,Node next,Node prev) {
			this.data = value;
			this.next = next;
			this.prev = prev;
		}
	}
}
