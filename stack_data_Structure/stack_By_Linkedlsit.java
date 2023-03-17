package stack_data_Structure;

//stack implemention using linked list;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

class Stack {
    public static Node head;

    public static boolean isEmpty() {
        return head == null;
    }

    // push operation in stack use to add the element on above other

    public static void push(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) { // stack is null then initialize it with newnode;
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // pop opeation use to delete the node from the stack;
    public static int pop() {
        // check condition for stack;
        if (isEmpty()) {
            System.out.println("your stack is empty"); // stack is null then initialize it with newnode;
            return -1;
        }
        // first we store the top element of the stack
        int top = head.data;
        head = head.next;
        return top;
    }

    public static int peek() {
        if (isEmpty()) {
            return -1;
        }
        Node top = head;
        return top.data;
    }

}

public class stack_By_Linkedlsit {
    public static void main(String[] args) {
        Stack.push(1);
       Stack. push(2);
       Stack. push(3);
       Stack.push(4);
       Stack.push(5);
        while (!Stack.isEmpty()) {
            System.out.println(Stack.peek());
            Stack.pop();
        }
    }
} 
