package Trees_DataStructure;
public class BST {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node Insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            root.left = Insert(root.left, data);
        } else {
            root.right = Insert(root.right, data);
        }
        return root;
    }

    public static boolean isKeyFound(Node root,int key){
        if(root==null){
            return false;
        }

        if(root.data>key){
           return isKeyFound(root.left, key);
        }
        if(root.data==key){
            return true;
        }else{
            return isKeyFound(root.right, key);

        }
    }
    public static void InOrder(Node root) {
        if (root == null)
            return;
        InOrder(root.left);
        System.out.print(root.data + " ");
        InOrder(root.right);
    }
public static Node Delete(Node root,int Value){
    if(root.data>Value){
root.left=Delete(root.left, Value);
    }
    if(root.data<Value){
root.right=Delete(root.right, Value);
    }else{
  /// case 1 for leaf:
  if(root.left==null && root.right==null){
    return null;
  }
  //case 2
  else if(root.left==null){
    return root.right;
  } 
  else if(root.right==null){
    return root.left;
  }
  //case 3
  Node IS=InOrderSuccessor(root.right);
  root.data=IS.data;
  root.right=Delete(root.right, Value);
    }
    return root;
}
public static Node InOrderSuccessor(Node root){
while(root.left!=null){
    root=root.left;
}
return root;
}
    public static void main(String[] args) {
        int[] Values = { -1, 2, 6, 3, 8, 9, -3 };

        Node root = null;
        for (int i = 0; i < Values.length; i++) {
            root = Insert(root, Values[i]);
        }
     
        InOrder(root);
        System.out.println("\nafter deleting 8 9 2 ");
        Delete(root, 8);
        Delete(root, 9);
        Delete(root, 2);
        InOrder(root);
        // System.out.println("searching key in tree ");
        // System.out.println(isKeyFound(root, 8));
    }
}
