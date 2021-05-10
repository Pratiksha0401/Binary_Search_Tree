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
		 
		 tree.search(63);
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
	 
	 static boolean checkIfExist( Node node, int key)
	    {
	        if (node == null)
	            return false;
	     
	        if (node.key == key)
	            return true;
	     
	        // then recur on left subtree
	        boolean res1 = checkIfExist(node.left, key);
	       
	        // node found, no need to look further
	        if(res1) return true;
	        
	        // node is not found in left, so recur on right subtree
	        boolean res2 = checkIfExist(node.right, key);
	     
	        return res2;
	    }
	 
	 public void search(int key) {
	     
	     if (checkIfExist(root, key))
	         System.out.println( key +" exists");
	     else
	         System.out.println(key + " does not exits");
		 
	 }
	 
}
