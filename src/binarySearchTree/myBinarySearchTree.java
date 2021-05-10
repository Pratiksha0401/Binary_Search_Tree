package binarySearchTree;

public class myBinarySearchTree {
	public static void main(String[] args) {
		
		BinarySearchTree tree = new BinarySearchTree();
		tree.add(56);
		tree.add(30);
		tree.add(70);
		
		 tree.inorder();
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
}
