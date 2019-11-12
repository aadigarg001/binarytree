class BinaryTree { 
  
   
    class Node { 
        int data; 
        Node left, right; 
  
        public Node(int a) { 
            data = a; 
            left = right = null; 
        } 
    } 
  
   
    Node root = null; 
 
   
    void insert(int a) { 
       root = insertN(root, a); 
    } 
      
   
    Node insertN(Node root, int a) { 
  
        if (root == null) { 
            root = new Node(a); 
            return root; 
        } 
 
        if (a < root.data) 
		{
			if(root.left!=null)
			{
				insertN(root.left,a);
			}
			else
			{
			   root.left= new Node(a);	
			}
		}
        else if (a > root.data) 
            if(root.right!=null)
			{
				insertN(root.right,a);
			}
			else
			{
			   root.right= new Node(a);	
			}         
  
        return root; 
    } 
  
  
   
    public static void main(String[] args) { 
        BinaryTree leave = new BinaryTree(); 
  
        leave.insert(50); 
        leave.insert(30); 
        leave.insert(70); 
        leave.insert(20); 
        leave.insert(40); 
        leave.insert(60); 
        leave.insert(80); 
  
    
    } 
} 