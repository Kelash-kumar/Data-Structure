package stack_data_Structure;

import java.rmi.server.ObjID;

/**
 * 4 main method:
 * peak : return type ArrayStack
 * pop : return ArrayStack to access the element
 * push(Object obj) : return type void
 * size() : int
 */
// ---> ADT is roiugh sketch

interface stack {

    public int size();

    public void push(Object obj);

    public Object pop();

    public Object peek();

}

class ArrayStack implements stack {
    private Object[] array; // creating an array
    private int size; // defining the size

    public ArrayStack(int capacity) {
        array = new Object[capacity]; // initialize the array length;
    }

    private boolean isEmpty() {
        return (size == 0);
    }

    public void push(Object obj) {
        if (size == array.length)
            resize();
        array[size++] = obj;
    }

    public Object pop() {
        if (size == 0)
            throw new IllegalStateException();

        return array[--size];
    }

    public Object peek() {
        if (size == 0)
            throw new IllegalStateException();

        return array[size - 1];
    }

    public int size() {
        return size;
    }

    private void resize() {
        Object[] duplicateArray = array;
        array = new Object[2 * duplicateArray.length]; // changing the size of old array...
        System.arraycopy(duplicateArray, 0, array, 0, size);
    }

    // comparing the two equal stack:
    public boolean arrayStackEqual(ArrayStack stackList) {
        if (this.size != stackList.size)
            return false;
        if (this.size() == stackList.size())
            for (int i = 0; i < size(); i++)
                if (!(this.array[i].equals(stackList.array[i])))
                    return false;

        return true;
    }

    // converting all the element of stack into string;
    public void ToString() {
        if (isEmpty()) {
            System.out.println("This is empty list");
        }
        String s = "";
        for (int i = 0; i < size(); i++) {
            s += " " + array[i].toString();
        }
        System.out.println(s);
    }

    /// deletig the bottom element of the stack:
    public void deleteBottomElement() {
        if (isEmpty()) {
            System.out.println("Stack is underfellow");
        }

        Object[] newarr = array;
        array = new Object[newarr.length - 1];
        array[0] = null;
        System.arraycopy(newarr, 1, array, 0, --size);

    }

    public void replace_BottomWithTop() {
        String store = peek().toString(); // 934
        pop();
        push(array[0]); // apple;
        array[0] = store;// 934

    }

    public void traverseStack() {
        if (isEmpty())
            System.out.println("stack is underfellow");
        for (int i = size - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

    }

    public void copyStackAsReverse(stack stack1) {
        while (this.size() != 0)
            stack1.push(this.pop());

    }

    public void copyAsSameStack(ArrayStack stack1) {
        stack1.array = this.array;
        stack1.size = this.size;
    }

    public ArrayStack reverseStack() {

        if (this.isEmpty()) {
            System.out.println("stack is empty ");
            return this;
        }
        ArrayStack stack2 = new ArrayStack(this.size);

        for (int i = this.size - 1; i >= 0; i--)
            stack2.push(array[i]);

        return stack2;

        /// way one:
        // Object top = this.pop();
        // this.reverseStack();
        // this.pushAtBottom(top);
        // way two:
        // ArrayStack s1 = new ArrayStack(size);
        // ArrayStack s2 = new ArrayStack(size);
        // while (this.size() != 0) {
        // s1.push(this.peek());
        // this.pop();
        // }
        // while (s1.size() != 0) {
        // s2.push(s1.peek());
        // s1.pop();
        // }
        // if (this.isEmpty()) {
        // while (s2.size() != 0) {
        // this.push(s2.peek());
        // s2.pop();
        // }
        // }

    }

    public void pushAtBottom(Object data) {
        if (this.isEmpty()) {
            this.push(data);
            return;
        }

        array[0] = data;
        size++;

    }

    public ArrayStack mergeStack(ArrayStack stack1, ArrayStack stack2) {
        for (int i = 0; i < stack1.size; i++)
            this.push(stack1.array[i]);
        for (int i = 0; i < stack2.size; i++)
            this.push(stack2.array[i]);
        return this;
    }

    public Object getMiddleElement() {
        int mid = size / 2;
        return array[mid - 1];
    }

}

public class stack_01 {
    public static void main(String[] args) {
        ArrayStack fruits = new ArrayStack(10);
        ArrayStack fruit2 = new ArrayStack(10);
        ArrayStack fruit3 = new ArrayStack(10);

        fruit2.push("patoto");
        fruit2.push("carrot");
        fruit2.push("califlower");
        fruit2.push("groundnet");
        fruit2.push("Vegetables");

        fruits.push("Apple");
        fruits.push("Banana");
        fruits.push("Mango");
        fruits.push("Gauva");
        fruits.push("Fruits");
        // fruits.pushAtBottom("fruits end");
        // System.out.println(fruits.getMiddleElement());
        fruits.copyAsSameStack(fruit3);
        fruit3.traverseStack();

    }
}

class RPN {
    RPN(String[] args) {
        stack Stack = new ArrayStack(args.length);
        for (int i = 0; i < args.length; i++) {
            String input = args[i];
            if (isAnOperator(input)) {
                double x = Double.parseDouble((String) Stack.pop());
                double y = Double.parseDouble((String) Stack.pop());
                double z = evalute(x, y, input);
                Stack.push("" + z);
            } else {
                Stack.push(input);
            }
        }
    }

    private boolean isAnOperator(String s) {
        return (s.length() == 1 && "ASMD".indexOf(s) >= 0);
    }

    private double evalute(double x, double y, String op) {
        double z = 0;
        if (op.equals("A"))
            z = x + y;
        else if (op.equals("S"))
            z = x - y;
        else if (op.equals("S"))
            z = x * y;
        else
            z = x - y;
        System.out.println(x + " " + op + " " + y + " = " + z);
        return z;
    }
}
// public static void main(String[] args) {
// new RPN(args);
// }
// }
