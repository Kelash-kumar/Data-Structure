package Trees_DataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class Trees {
    static int  count=0;
    static class Node {
        int data;
        Node right;
        Node left;
        
        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    static class BinaryTree {
        
        int index = -1;

        public Node buildTree(int[] nodes) {
            index++;

            if (nodes[index] == -1) {
                return null;
            }

            Node newnode = new Node(nodes[index]);
            newnode.left = buildTree(nodes);
            newnode.right = buildTree(nodes);

            return newnode;
        }
    }
    public static void preOrder_Traversal(Node root) {
        // root -> left -> right
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder_Traversal(root.left);
        preOrder_Traversal(root.right);
        count++;
        
    }

    public static void postOrder_Traversal(Node root) {
        // left right root
        if (root == null) {
            return;
        }

        postOrder_Traversal(root.left);
        postOrder_Traversal(root.right);
        System.out.print(root.data + " ");
    }

    public static void InOrder_Traversal(Node root) {
        // left root right
        if (root == null) {
            return;
        }

        InOrder_Traversal(root.left);
        System.out.print(root.data + " ");
        InOrder_Traversal(root.right);
    }

    public static void LevelOrder_Traversal(Node root) {
        if (root == null)
            return;
        Queue<Node> treelist = new LinkedList<>();
        treelist.add(root);
        treelist.add(null);

        while (!treelist.isEmpty()) {
            Node currNode = treelist.remove();
            if (currNode == null) {
                System.out.println();
                if (treelist.isEmpty()) {
                    break;
                } else {
                    treelist.add(null);
                }

            } else {
                System.out.print(currNode.data + " ");
                if (currNode.left != null) {
                    treelist.add(currNode.left);
                }
                if (currNode.right != null) {
                    treelist.add(currNode.right);
                }
            }
        }
    }

    public static int CountTotalNodes(Node root) {
        if (root == null)
            return 0;

        int leftSubTree = CountTotalNodes(root.left);
        int rightSubTree = CountTotalNodes(root.right);
        return leftSubTree + rightSubTree + 1;
    }

    public static void main(String[] args) {
        int[] treesNodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(treesNodes);
        // System.out.println(root.data);
        System.out.println("pre order ");
        preOrder_Traversal(root);
        System.out.println("\npost order ");
        postOrder_Traversal(root);
        System.out.println("\nIn order ");
        InOrder_Traversal(root);
        System.out.println("\nLevel order travesal");
        LevelOrder_Traversal(root);
        System.out.println("total number of nodes in a tree");
       System.out.println(CountTotalNodes(root));
       System.out.println("count"+count);
    }
}
