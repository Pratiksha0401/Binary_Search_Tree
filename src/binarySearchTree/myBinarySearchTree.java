package binarySearchTree;

public class myBinarySearchTree {
	public static void main(String[] args) {
		
		BinarySearchTree tree = new BinarySearchTree();
		tree.add(56);
		tree.add(30);
		tree.add(70);
		tree.add(56);
		tree.add(30);
		tree.add(22);
		tree.add(11);
		tree.add(3);
		tree.add(16);
		tree.add(40);
		tree.add(70);
		tree.add(60);
		tree.add(65);
		tree.add(63);
		tree.add(67);
		tree.add(95);
		
		 tree.inorder();
		 
		 System.out.println("\nThe size of Binary tree is : "+ tree.size());
		 
		
	}
}

class BinarySearchTree {
	
    class Node {
   
       int key;
       Node left, right;

       public Node(int key) {
           this.key = key;
           this.left =  null;
           this.right = null;
       }
     }
    
    Node root = null;
	 
	 public void add(int key) {
	   
	         root = addRecurrsivly(root, key);
	 }
	 
	public  Node addRecurrsivly(Node root, int key) {
			   
		if (root == null) {
		        
			root = new Node(key);
		    return root;
		}
		if (key < root.key)
		    root.left = addRecurrsivly(root.left, key);
		else if (key > root.key)
		    root.right =addRecurrsivly(root.right, key);
		
		return root;
		 }	 
	 
	 public  void inorder()  {
		 
         inorderAt(root);
 }
	 
	 public void inorderAt(Node root)  {
		   
	        if (root != null) {
	            inorderAt(root.left);
	            System.out.print(root.key + " ");
	            inorderAt(root.right);
	        }
	 }

	
	public int size() {
		 return sizeOfNode(root);
	 }
	 
	 public int sizeOfNode(Node root) {
		 if(root == null)
			 return 0;
		 else
			 return(sizeOfNode(root.left )+ 1 + sizeOfNode(root.right));
	 }
	 
}
