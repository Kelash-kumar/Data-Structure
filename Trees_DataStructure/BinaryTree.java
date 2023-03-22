package Trees_DataStructure;

public class BinaryTree {

   static class Node {
        Object data;
        Node left, right;

        Node(Object data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTrees{
        
        int index = -1;
        
        public Node builTree(Object[] nodes) {
            index++;
            if (nodes[index] == null)
            return null;
            Node newNode = new Node(nodes[index]);
            newNode.left = builTree(nodes);
            newNode.right = builTree(nodes);
            return newNode;
        }
    }

        public static void preOrder_Traversal(Node root){
        if(root==null)
        return ;
       System.out.print(root.data+" ");
       preOrder_Traversal(root.left);
       preOrder_Traversal(root.right);
    }

    public static void main(String[] args) {
        
        String[] nodes={"1","2",null,null,"3",null,null};
      BinaryTrees bt=new BinaryTrees();
       Node root= bt.builTree(nodes);
       preOrder_Traversal(root);
    }
}
