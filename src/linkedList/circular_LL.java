package linkedList;
/**circular LL stands for Circular Linked List 
 *Taught by Kunal khushwaha.
 *Link : https://www.youtube.com/watch?v=58YbpRDc4yw&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=45&ab_channel=KunalKushwaha 
 * **/
public class circular_LL {
	private Node head;
	private Node tail;
	public int size =0;
	public circular_LL() {
		size =0;
	}
	public void insertFirst(int value) {
		Node node = new Node(value);
		node.next = head;
		head = node;
		if(tail == null) {
			tail = head;
			
		}
		size++;
		
	}
	public void insert(int value) {
		if(size == 0) {
			insertFirst(value);
			return;
		}
		//Node node = get(size);
		Node node1 = new Node(value);
		node1.next = head;
		tail.next = node1;
		tail = node1;
		size++;
	}
	public Node get(int index) {
		Node temp = head;
		for(int i =1;i<index;i++) {
			temp = temp.next;
		}
		return temp;
	}
	public void display() {
		Node temp = head;
		while(temp != null) {
			if(temp == tail) {
				System.out.print(temp.value + " -> ");
				break;
			}
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}
		System.out.println("END");
	}
	public void insertLast(int value) {
		insert(value);
	}
	public void delete() {
		deleteFirst();
	}
	public void insertAt(int value,int index) {
		if(index == 0) {
			insertFirst(value);
		}
		if(index == size-1) {
			insertLast(index);
		}
		size++;
		Node node = get(index-1);
		Node node1 = new Node(value,node.next);
		node.next = node1;
	}
	public void deleteFirst() {
		Node node = head.next;
		node.next = head.next.next;
		tail.next = node;
		head = node;
		size--;
	}
	public void deleteLast() {
		Node node = get(size-1);
	     node.next = head;
	     tail = node;
		size--;
	}
	public void deleteAt(int index) {
		if(index == 0) {
			deleteFirst();
		}
		if(index == size-1) {
			deleteLast();
			return;
		}
		Node node = get(index);
		node.next = node.next.next;
	}
	public void find(int index) {
		Node node = get(index);
		System.out.println(node.value);
	}
	
	private class Node{
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value = value;
			
		}
		public Node(int value,Node node) {
			this.value = value;
			this.next = node;
		}
	}
}
