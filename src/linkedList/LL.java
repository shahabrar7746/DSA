package linkedList;
//This is a code for Singly LinkedList(LL). taught by kunal khushwaha.
//link : https://www.youtube.com/watch?v=58YbpRDc4yw&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=45&ab_channel=KunalKushwaha
public class LL {

    private Node head;
    private Node tail;
    public int size;

    public LL() {
        this.size = 0;
    }
    public void sort() {
    	Node first =head;
    	
    	while(first.next != null) {
    		Node second = first.next;
    		while(second != null) {
    			if(first.value > second.value) {
    				int temp = first.value;
    				first.value = second.value;
    				second.value = temp;
    			}
    			second = second.next;
    		}
    		first = first.next;
    	}
    	
    	
    }
    void reverseAtIndex(int index) {
    	Node cur = head;
    	Node prev = null;
    	for(int i = 1;i<index;i++) {
    		Node temp = cur.next;
    		cur.next = prev;
    		prev = cur;
    		cur = temp;
    		
    	}
    	display();
    }
    public void insertInSorted(int key1) { 
    	Node node = head;
		Node temp = new Node(key1);

		if(key1 <= head.value) {
			temp.next = head;
			head = temp;
			return;
		}
    	while(node.next != null) {
    	
    		
    		
    		if(node.value < key1 && key1 <= node.next.value) {
    			Node temp1 = node.next;
    			node.next = temp;
    			temp.next = temp1;
    			
    			return;
    		}
    		node = node.next;
    	}

    	node.next = temp;
    	temp.next = null;
    	tail = temp;
    	
    	
    }
    private  Node reverseRecur(Node node) {
    	
    	if(node.next == null) {
    		System.out.print(node.value + " -> ");
    		head = node;
    		return node;
    	}
    		
    		
    		
    	reverseRecur(node.next).next = node;
    	System.out.print(node.value + " -> ");
            return node;    	
    	
    }
    
      private  static Node getMid(Node head){
        Node mid = head;
        Node f = mid;
        while(f != null && f.next != null){
            mid = mid.next;
            f = f.next.next;
        }
        
        return mid;
    }
    private static Node reverse(Node head){
        Node prev = null;
        Node cur = head;
        while(cur !=  null){
            Node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        
       
        return prev;
    }
    public Node pairwiseSwap()
    {
    	 
        Node s = head;
        Node f = head.next;
        head = f;        Node prev = s
        		;
        while(f != null && f.next != null ){

      //Swap
        	  
     Node temp = f.next;
     f.next = s;
     s.next = temp;
     
  
   prev = s;
      s = s.next;
      f = s.next;
      if(f != null) {
      prev.next = f;
      }
display()
;
           }
           return head;
    }
       public void reorderlist() {
            // Your code here
            Node mid = getMid(head);
            Node list2 = mid.next;
            mid.next = null;
           
            list2 = reverse(list2);
            
            
            Node node = head;
            while(list2 != null ){
                Node temp = node.next;
                node.next = list2;
                Node temp2 = node.next.next;
                node.next.next = temp;
                node = node.next.next;
                list2 = temp2;
                
                
            }
            display();
           
        }
//    public void reverse() {
//    	Node prev = null;
//    	Node present = head;
//    	while(present != null) {
//    		Node temp = present.next;
//    		present.next = prev;
//    		prev = present;
//    		
//    		present = temp;
//    		
//    	}
//    	head = prev;
//        
//    	
//	}
    public void reverse() {
    	reverseRecur(head);
    	System.out.print(  "END ");
	}
    Node sortedMerge(Node head1, Node head2) {
        // This is a "method-only" submission. 
        // You only need to complete this method
        Node newList = null;
        Node head = newList;
        Node node1 = head1;
        Node node2 = head2;
        while(node1 != null && node2 != null){
            if(node1.value < node2.value){
                Node node = new Node(node1.value);
                newList = node;
                newList = newList.next;
                node1 = node1.next;
        }else
        {
            Node node = new Node(node2.value);
                newList = node;
                newList = newList.next;
            node2 = node2.next;
        }
        }
        while(node1 != null){
             Node node = new Node(node1.value);
                newList = node;
                newList = newList.next;
                node1 = node1.next;
        }
        while(node2 != null){
             Node node = new Node(node1.value);
                newList = node;
                newList = newList.next;
                node1 = node1.next;
        }
        return head;
      } 
    public void removeDupli() {
    	Node temp = head;
    	
    	while(temp.next != null) {
    		Node temp2 = temp.next;
    		if(temp.value == temp2.value) {
    			temp.next = temp2.next;
    			temp2.next = null;
    			size--;
    		}else {
    		temp = temp.next;
    		}
    	}
    }
    public void insertAt(int value,int index) {
    	int i =0;
    	if(index == 0) {
    		new LL().insertFirst(value);
    		return;
    	}
    	if(index == size-1) {
    		new LL().insertLast(value);
    		return;
    	}
       Node temp = head;
    for( i =1;i<index;i++) {  
    	temp = temp.next;
    }
    Node node = new Node(value);
    Node temp2 = temp.next;
    temp.next = node;
    node.next = temp2;
    size++;
       }
    private void helperInsertAtRec(int value,int index,int i,Node temp) {
    	if(i== index && temp.next != null) {
    		Node node = new Node(value);
    		node.next = temp.next;
    		temp.next = node;
    		
    	return;	
    		
    	}
    	
    	helperInsertAtRec(value,index,i+1,temp.next);
    	
    	
    }
    Node getMid() { 
    	Node mid = head;
    	Node end = mid.next;
    	while(end.next != null) {
    		mid = mid.next;
    		end = end.next.next;
    	}
    	return mid;
    }
    public void palindrome() {
    Node mid = getMid();
    //reverse(mid);
    display();
    
    }
    public void insertAtRec(int value,int index) {
    	if(index == size-1) {
    		insertRec(value);
    	}
    	if(index == 0) {
    		insertFirst(value);
    	}
    	helperInsertAtRec(value,index-2,0,head);
    }
    public void insertLast(int value) {
    	if(tail == null) {
    		new LL().insertFirst(value);
    		return;
    	}
    	Node node = new Node(value);
    	tail.next = node;
    	tail = node;
    	size++;
    }
    public void display() {
    	Node temp = head;
    	while(temp != null) {
    		System.out.print(temp.value + " -> ");
    		temp = temp.next;
    	}
    	System.out.println("END");
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }
  
    public int deleteFirst() {
     
    	int val = head.value;
    	head = head.next;
    	size--;
    	return val;
    }
    public int find(int index) {
    	Node node = get(index);
    	return node.value;
    }
    public int delete(int index) {
    	Node node = get(index-1);
    	int val = node.next.value;
    	node.next = node.next.next;
    	size--;
    	return val;
    }
    
    private void recursion(Node temp,int value) {
    //This function is for Inserting value in the LinkedList using Recursion.
    	if(temp.next == null) {
    		Node node = new Node(value);
    		temp.next = node;
    		node.next = null;
    		tail = node;
    		return;
    	}
    	recursion(temp.next,value);
    }
    public void insertRec(int value) {
    	size++;
    	recursion(head,value);
    }
    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }
    public void insert(int value) {
    	if(tail == null) {
    		insertFirst(value);
    		return;
    	}
    	Node node = new Node(value);
    	tail.next = node;
    	tail = node;
    	size++;
    }
   
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    public void addOne() {
    	
    	display(addOne(head));
    }
    private void display(Node head) {
    	
    	Node temp = head;
    	while(temp != null) {
    		System.out.print(temp.value + " -> ");
    		temp = temp.next;
    	}
    	System.out.println("END");
        
    }
    private   Node addOne(Node head) 
    { 
        //code here.
        Node node = head;
        int num = 0;
        while(node != null){
        	
            num = num*10;
            num = num + node.value;
            node = node.next;
        }
        
        num++;
        node = new Node(-1);
       Node temp = node;
       while(num != 0) {
    	   node.next = new Node(num%10);
    	   node = node.next;
    	   num = num/10;
    	   
       }
       Node temp2 = temp.next;
       temp.next = null;
       temp = temp2;
       
        return reverse(temp);
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}