class Node{
	Node left ;
	Node right;
	int data;

Node(int value){
	left = null;
	right = null;
	data = value;
}
}

class BinaryFunction{
	Node root;
	int m = 0;
	public void insert(int data)
     {
         root = insert(root, data);
     }
	Node insert(Node node , int data){
	if(node == null)
	{
		node = new Node(data);
	}		
	else if(data<=node.data){
		node.left = insert(node.left, data);
	}
	else {
		node.right = insert(node.right, data);
	}
	return node;
	}
	
	int size(){
		return (size(root));
	}
	int size(Node node)
	{ 
		if (node == null) return 0;
		else 
		{ System.out.println("size"+m);
			
			m = size(node.left) + size(node.right);
			return(m + 1);
	}
	}
	int maxDepth(){
		return(maxDepth(root));
	}
	int maxDepth(Node node)
	{
		if(node == null){
		return 0;
		}
			else {
				int ldepth = maxDepth(node.left);
				int rdepth = maxDepth(node.right);
			return (Math.max(ldepth , rdepth) + 1);
			}
		}
		int minValue(){
			return (minValue(root));
		}
		int minValue(Node node)
		{
			Node current = root;
			while(current.left!=null)
			{
				current = current.left;
			}
			return(current.data);
		}
	
void printTree(){
		printTree(root);
	}
void printTree(Node node){
	inorder(root);
	preorder(root);
	postorder(root);
}
void inorder(Node node){
	inorder(node.left);
	System.out.println(node.data+" ");
	inorder(node.right);
	}
void preorder(Node node){
	System.out.println(node.data+" ");
	preorder(node.left);
	preorder(node.right);
	}
void postorder(Node node){
	postorder(node.left);
	postorder(node.right);
	System.out.println(node.data+" ");
	}
	/*public boolean hasPathSum(int sum){
		return (hasPathSum(root, sum));
	}*/
	
	public void printPath(){
		int[] path = new int[1000];
		printPaths(root, path, 0);
	}
	public void printPaths(Node node,int path[],int pathlen){
		if(node == null) return;
		path[pathlen] = node.data;
		pathlen++;
		if(node.left == null && node.right == null){
			printArray(path,pathlen);
		}
		else {
		printPaths(node.left, path, pathlen);
		printPaths(node.right, path,pathlen);
			
		}
	}
	private void printArray(int[] ints, int len) {
int i;
for (i=0; i<len; i++) {
System.out.print(ints[i] + " ");
}
System.out.println();
}
	void mirror(){
	mirror(root);
	}

void mirror(Node node){
if(node!=null){
mirror(node.left);
mirror(node.right);
Node temp;
temp = node.left;
node.left = node.right;
node.right = temp; 
}
}

public void doubleTree(){
	doubleTree(root);
}
public void doubleTree(Node node){
	Node oldLeft;
	if(node==null) return;
	doubleTree(node.left);
 	doubleTree(node.right);
 	
	
	oldLeft = new Node (node.data);
	node.left.left = oldLeft;
}
}

class Binary{
	public static void main(String s[])
	{
		BinaryFunction bst = new BinaryFunction();
		bst.insert(2);
	    bst.insert(1);
		bst.insert(3);
		bst.insert(4);
	    bst.insert(11);
		bst.insert(23);
		bst.insert(23);
	    bst.insert(14);
		bst.insert(31);
		bst.insert(25);
	    bst.insert(15);
		bst.insert(33);
	int l = bst.size();
	System.out.println("l    "+l);
	bst.printTree();
	bst.printPath();
			}
}