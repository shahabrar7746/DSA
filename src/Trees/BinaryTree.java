package Trees;

import Trees.AVL.Node;

public class BinaryTree {
	private int size;
	private Node root;
	private int height;
	public void Binarytree(){
		root = null;
	}
	private Node buildTree(Node root,int data) {
		if(root == null) {
			root = new Node(data);
			size += 1;
			return root;
		}
		if(data < root.data && data != -1) {
			root.left = buildTree(root.left,data);
		}else if(data > root.data && data != -1) {
			root.right = buildTree(root.right,data);
		}
		root.height = Math.max(height (root.left), height(root.right)+1);
		return rotate(root);
	}
	private void PreOrderTraversal(Node root) {
		if(root== null) {
			return;
		}
		System.out.print(root.data + " ");
		PreOrderTraversal(root.left);
		PreOrderTraversal(root.right);
		
	}
	
	 public int height() {
		    return height(root);
		  }
		  private int height(Node node) {
		    if (node == null) {
		      return -1;
		    }
		    return node.height;
		  }
	public void postOrder() {
		postOrderTraversal(root);
		System.out.println();
	}
	
	private void postOrderTraversal(Node root) {
		if(root== null) {
			return;
		}
		
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.print(root.data + " ");
		
		
	}
	public void inOrder() {
		inOrderTraversal(root);
		System.out.println();
	}
	
	private void inOrderTraversal(Node root) {
		if(root== null) {
			return;
		}
		
		inOrderTraversal(root.left);
		System.out.print(root.data + " ");
		inOrderTraversal(root.right);
		
		
		
	}
	
	public void preOrder() {
		PreOrderTraversal(root);
		System.out.println();
	}
	public boolean isEmpty()
	{
		return root == null;
		
	}
	private void  getLeafes(Node root) {
		if(root == null) {
			
			return;
		}
		System.out.print(root.data + " ");
		getLeafes(root.left);
		getLeafes(root.right);
		
	}
	public void leaves() {
		getLeafes(root);
	}
	private int max(Node root) {
		if(root == null) {
			return Integer.MIN_VALUE;
		}
		int leftMax =  max(root.left);
		
		int rightMax = max(root.right);
		if(rightMax < root.data) {
		  rightMax = root.data;
		}
             if(rightMax < leftMax) {
            	 return leftMax;
             }
             return rightMax;
	}
	public int maxValue() {
		return max(root);
	}
	private int min(Node root) {
		if(root == null) {
			return Integer.MAX_VALUE;
		}
		int leftMin =  min(root.left);
		
		int rightMin = min(root.right);
		if(rightMin > root.data) {
		  rightMin = root.data;
		}
             if(rightMin > leftMin) {
            	 return leftMin;
             }
             return rightMin;
	}
	public int minValue() {
		return min(root);
	}
	public void add(int data) {
	root = 	buildTree(root,data);
		
	}
	public boolean isBalanced() {
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		if(leftHeight < rightHeight) {
			return rightHeight - leftHeight <= 1;
		}
		return leftHeight - rightHeight <= 1;
	}
	
	private int getSize(Node root,int size) {
		if(root == null) {
			return 0;
		}
		size = size + getSize(root.left,size);
		size = size + getSize(root.right,size);
		return size;
	}
	public int size() {
		return size;
	}
	private Node rotate(Node root) {
		if(height(root.left) - height(root.right) > 1) {
			//left heavy.
			if(height(root.left.left) - height(root.left.right) > 0) {
				//left-left 
				return rightRotate(root);
			}
			if(height(root.left.left) - height(root.left.right) < 0) {
				//left-right 
				root.left = leftRotate(root.left);
				return rightRotate(root);
			 
				
			}
		}
		if(height(root.left) - height(root.right) < -1) {
			//right heavy.
			if(height(root.right.left) - height(root.right.right) < 0) {
				//right-right 
				return leftRotate(root);
			}
			if(height(root.right.left) - height(root.right.right) > 0) {
				//right - right
				root.right = rightRotate(root.right);
				return leftRotate(root);
			 
				
			}
		}
		return root;
	}
	private Node leftRotate(Node c) {
		// TODO Auto-generated method stub
		Node p = c.right;
		Node t = p.left;
		p.left  = c;
		c.right = t;
		
		p.height = Math.max(height(p.left), height(p.right)  + 1);
		c.height = Math.max(height(c.left), height(c.right)  + 1); 
		return p;
	}
	// private static int referInt = Integer.MAX_VALUE;
	 public  int minDiff(int k) {
		 return minDiff(root,k);
	 }
	  public  static int minDiff(Node  root, int K) 
	    { 
	        // Write your code here
		  int num = Integer.MAX_VALUE;
		  return  fun(root,K,num);
	        
	        
	      
	    } 
	    private static int  fun(Node root,int k,int referInt){
	        if(root == null){
	            return Integer.MAX_VALUE;
	        }
	    	

	        if(k - root.data < referInt && k-root.data != 0){
	        	            referInt = k - root.data;
	        }
	       int num = Math.min( fun(root.left,k,referInt),
	        fun(root.right,k,referInt));
	        return Math.min(num, referInt);
	    }
	private Node rightRotate(Node p) {
		// TODO Auto-generated method stub
		Node c = p.left;
		Node t = c.right;
		c.right = p;
		p.left = t;
		p.height = Math.max(height(p.left), height(p.right)  + 1);
		c.height = Math.max(height(c.left), height(c.right)  + 1); 
		return c;
	}
	public static void main(String[] args) {
		int arr[] = {10,2,11,1,5,-1,-1,-1,-1,3, 6,-1, 4,
				13};
		BinaryTree tree = new BinaryTree();
		for(int x : arr) {
			tree.add(x);
		}
		System.out.println(tree.minDiff(13));
	}
	private class Node{
	
	
	public int height;
	private Node left;
	private Node right;
	private int data;
	private  Node(int data) {
		this.data = data;
		left = null;
		right = null;
		
	}
	}
}

