package treedsa;

public class B1 {
   static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data=data;
            this.left=left;
            this.right=right;
        }
   
   } 
   static class BinaryTree {
    static int idx = -1;
    public static Node buildTree(int nodes[]){  // this is the method
        idx++;
        if(nodes[idx]==-1){
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left=buildTree(nodes);
        newNode.right=buildTree(nodes);
        return newNode;
    }
   
   }
   public static void main(String[] args) {
    int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
    BinaryTree obj = new BinaryTree();

    Node root = obj.buildTree(nodes);
    System.out.println(root.data);
   }
}

