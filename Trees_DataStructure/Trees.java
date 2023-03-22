package Trees_DataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class Trees {
    static int count = 0;

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

    public static int sumOfNodes(Node root) {
        if (root == null)
            return 0;

        int leftSubTreeSum = sumOfNodes(root.left);
        int rightSubTreeSum = sumOfNodes(root.right);

        return leftSubTreeSum + rightSubTreeSum + root.data;
    }

    public static int HeightOfTree(Node root) {
        if (root == null)
            return 0;

        int leftSubTreeHeight = HeightOfTree(root.left);
        int rightSubTreeHeight = HeightOfTree(root.right);

        int Height = Math.max(leftSubTreeHeight, rightSubTreeHeight) + 1;
        return Height;
    }

    // this approach rewuire O(n^2) time complexity:
    
    // public static int DiameterOfTree(Node root) {
    // if (root == null)
    // return 0;

    // int leftSubTreeDiameter = DiameterOfTree(root.left);
    // int rightSubTreeDiameter = DiameterOfTree(root.right);
    // int diameter=HeightOfTree(root.left)+HeightOfTree(root.right)+1;
    // return Math.max(diameter, Math.max(leftSubTreeDiameter,
    // rightSubTreeDiameter));
    // }

    // this approach require O(n) time complexity:

    public static int DiameterOfTree(Node root) {
        if (root == null)
            return 0;

        int leftSubTreeDiameter = DiameterOfTree(root.left);
        int rightSubTreeDiameter = DiameterOfTree(root.right);
        int diameter = HeightOfTree(root.left) + HeightOfTree(root.right) + 1;

        return Math.max(diameter, Math.max(leftSubTreeDiameter, rightSubTreeDiameter));
    }

    public static boolean isMatched(Node root, Node subroot) {
        if (root == null && subroot == null)
            return true;
        if (root == null || subroot == null)
            return false;

        if (root.data == subroot.data) {
            return isMatched(root.left, subroot.left) && isMatched(root.right, subroot.right);
        }
        return false;
    }

    public static boolean isSubTree(Node root, Node subroot) {

        if (subroot == null)
            return true;
        if (root == null)
            return false;
        if (root.data == subroot.data) {
            if (isMatched(root, subroot)) {
                return true;
            }
        }

        return isSubTree(root.left, subroot) || isSubTree(root.right, subroot);
    }

    public static int sumOfNodes_At_KthLevel(Node root, int kthLevel) {
        if (root == null) {
            return 0;
        }
        int nthlevel = 0;
        int sum = 0;
        Queue<Node> list = new LinkedList<>();
        list.add(root);
        list.add(null);
        while (!list.isEmpty()) {
            Node currNode = list.remove();
            if (currNode == null) {
                nthlevel++;
                if (list.isEmpty()) {
                    break;
                } else if (nthlevel == kthLevel) {
                    while (list.remove() != null) {
                        sum += list.remove().data;
                    }
                } else {
                    list.add(null);
                }
            } else {
                if (currNode.left != null) {
                    list.add(currNode.left);
                }
                if (currNode.right != null) {
                    list.add(currNode.right);

                }
            }
        }
        System.out.println("sum   " + sum);
        return sum;
    }

    public static void main(String[] args) {
        int[] treesNodes = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        int[] subTreeNodes = { 1, 2, -1, -1, 3, -1, -1 };
        BinaryTree tree = new BinaryTree();
        BinaryTree subTree = new BinaryTree();

        Node root = tree.buildTree(treesNodes);
        Node subTreeRoot = subTree.buildTree(subTreeNodes);
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
        System.out.println("count  " + count);
        System.out.println("Total sum of Nodes ");
        System.out.println(sumOfNodes(root));
        System.out.println("Height of Tree ");
        System.out.println(HeightOfTree(root));
        System.out.println("Diameter of a tree ");
        System.out.println(DiameterOfTree(root));
        System.out.println(" Is Subtree ");
        System.out.println(isSubTree(root, subTreeRoot));
        sumOfNodes_At_KthLevel(root, 2);
    }
}
