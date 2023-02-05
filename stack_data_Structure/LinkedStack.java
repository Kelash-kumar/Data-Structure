package stack_data_Structure;



public class LinkedStack {
    private Node top;
    private int size;

    private class Node {
        Object data;
        Node next;

        Node(Object obj, Node next) {
            this.data = obj;
            this.next = next;
        }
    }

    public ArrayStack toArrayStack() {
        stack s = new ArrayStack(size);
        this.reverse_list();

        Node temp = top;
        int count = 0;
        while (temp != null) {
            s.push(temp.data);
            temp = temp.next;
            count++;
        }
        return (ArrayStack) s;
    }

    public int size() {
        return size;
    }

    public void push(Object obj) {
        top = new Node(obj, top);
        size++;
    }

    public Object pop() {
        if (size == 0)
            return "null";
        Object olObject = top.data;
        top = top.next;
        size--;
        return olObject;
    }

    public Object peek() {
        if (size == 0)
            return "null";
        return top.data;
    }

    public void ToString() {

    }

    public Object bottomElement() {
        if (size == 0)
            return null;

        Node temp = top;
        while (temp.next != null)
            temp = temp.next;

        return temp.data;
    }

    public void replace_BottomWithTop() {

    }

    public void copyReverseStackTo(stack fruit2) {

    }

    public void copyStack(ArrayStack s) {

    }

    public LinkedStack reverseLinkedStack() {
        if (size == 0)
            return null;

        LinkedStack ls2 = new LinkedStack();

        Node temp = this.top;
        while (temp != null) {
            ls2.push(temp.data);
            temp = temp.next;
        }
        return this;

    }

    public void pushAtBottom(Object data) {
        if (size == 0)
        return ;
      

    }

    public void numberInStack() {

    }

    private void printLinkedStack() {
        if (size == 0)
            return;

        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    private Node reverse_list() {
        Node prev = null;
        Node current = top;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        top = prev;
        return top;
    }

    public static void main(String[] args) {
        ArrayStack as = new ArrayStack(10);
        LinkedStack ls = new LinkedStack();
        ls.push("apple");
        ls.push("banana");
        ls.push("mango");
        ls.push("grapes");
        ls.push("watermelon");
        // System.out.println("\n before reverse stack \n");
        // ls.printLinkedStack();
        // // ls.toArrayStack();
        // // as.traverseStack();
        // ls= ls.reverseLinkedStack();
        // System.out.println("\n after reverse stack \n");
        ls.pushAtBottom("bottom fruits");
        ls.printLinkedStack();
        // System.out.println(ls.bottomElement());

    }
}



