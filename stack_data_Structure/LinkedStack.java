package stack_data_Structure;

public class LinkedStack implements stack {
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
        ArrayStack ArraySack_Object = new ArrayStack(size);

        Node p = top;
        for (int i = size - 1; i >= 0; i--) {
            ArraySack_Object.push(p.data);
            p = p.next;
        }
        ArraySack_Object = ArraySack_Object.reverseStack();
        return ArraySack_Object;

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


    public Object bottomElement() {
        if (size == 0)
            return null;

        Node temp = top;
        while (temp.next != null)
            temp = temp.next;

        return temp.data;
    }

    public void replace_BottomWithTop() {
        if (size == 0)
        throw new NullPointerException();

        Node temp = top;
        while (temp .next!= null)
            temp = temp.next;
   
            Object dummy=top.data;
            this.top.data=temp.data;
            temp.data=dummy;
        }
    

    public void copyReverseLinkedStackTo(LinkedStack stackObject2) {
        if (size == 0)
        throw new NullPointerException();
         
        Node temp = top;
        while (temp != null){
              stackObject2.push(temp.data);
            temp = temp.next;
        }

    }

    public LinkedStack copyLinkedStack(LinkedStack stackObject2) {
        if (size == 0)
            throw new NullPointerException();

        stackObject2.size = this.size;
        stackObject2 = this;
        return stackObject2;

    }

    public LinkedStack reverseLinkedStack() {
        if (size == 0)
            return null;

        this.reverse_LinkedStack();
        return this;

    }

    public void pushAtBottom(Object data) {
            if (size == 0)
            throw new NullPointerException();
    
           
            Node temp = top;
            while (temp .next!= null)
                temp = temp.next;
       
               temp.next=new Node(data,null);

    }


    private void printLinkedStack() {
        if (size == 0)
            throw new NullPointerException();

        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    private Node reverse_LinkedStack() {
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
        LinkedStack ls1 = new LinkedStack();
        ls.push("apple");
        ls.push("banana");
        ls.push("mango");
        ls.push("grapes");
        ls.push("watermelon");
        as = ls.toArrayStack();
// ls.replace_BottomWithTop();
ls.pushAtBottom("i am at bottom ");

        // ls.reverseLinkedStack();
        ls.printLinkedStack();
        // ls.copyReverseLinkedStackTo(ls1);
        // ls1 = ls.copyLinkedStack(ls1);
        // System.out.println("==============");
        // ls1.printLinkedStack();
        // as.traverseStack();
        // System.out.println("\n before reverse stack \n");
        // ls.printLinkedStack();
        // ls.toArrayStack();
        // // as.traverseStack();
        // ls= ls.reverseLinkedStack();
        // System.out.println("\n after reverse stack \n");
        // ls.pushAtBottom("bottom fruits");
        // ls.printLinkedStack();
        // System.out.println(ls.bottomElement());

    }
}
