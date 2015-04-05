class Node
{
Node left;
Node right;
Node parent;
int data;

Node(int a)
{
left=null;
right=null;
parent=null;
data=a; 
}


}

class BinaryTree
{

Node root;

BinaryTree()
{
this.root=null;
}
void insert(Node node , int data)
{
if(node==null)
{
root= new Node(data);
}

else if(node.data>data && node.left == null)
{
insert(node.left,data);
}

else if(node.data<data && node.right == null)
{
insert(node.right,data);
}
}
public void printInOrder(Node node)
    {
        if (node != null)
        {
            printInOrder(node.left);
            System.out.print(node.data + " - ");
            printInOrder(node.right);
        }
    }

    public void printPostOrder(Node node)
    {
        if (node != null)
        {
            printPostOrder(node.left);
            printPostOrder(node.right);
            System.out.print(node.data + " - ");
        }
    }

    public void printPreOrder(Node node)
    {
        if (node != null)
        {
            System.out.print(node.data + " - ");
            printPreOrder(node.left);
            printPreOrder(node.right);
        }
    }
public static void main(String[] args)
    {
        BinaryTree f = new BinaryTree();
        /**
         * Insert
         */
        f.insert(f.root, 20);
        f.insert(f.root, 5);
        f.insert(f.root, 25);
        f.insert(f.root, 3);
        f.insert(f.root, 7);
        f.insert(f.root, 27);
        f.insert(f.root, 24);

        /**
         * Print
         */
        f.printInOrder(f.root);
        System.out.println("");
        f.printPostOrder(f.root);
        System.out.println("");
        f.printPreOrder(f.root);
        System.out.println("");

     
}}