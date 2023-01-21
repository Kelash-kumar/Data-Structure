package stack_data_Structure;

import javax.xml.transform.Source;

public class Stack_In_Array {
    private int[] arr; // array which stors the ele;
    private int Top = -1;
    private int capacity;

    Stack_In_Array(int size) {
        this.capacity = size;
        this.arr = new int[size];
    }

    public boolean isEmpty() {
        return Top == -1;
    }
    public boolean isFull() {
        return Top == capacity-1;
    }

    public void push(int element) {
       if(isFull())
       {
        // System.out.println("stack is overfellow");
        resize();
        
    }

               arr[++Top] = element;
        
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("stack under fellow");
        }

        return arr[Top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.print(" stack is null");
            return -1;
        }
        return arr[Top];
    }

    public void traverse_Stack(){
        while(Top!=-1){
          System.out.println(  peek());
            pop();
            
        }
    }
    private void resize(){
      int[] newarr=arr;
      arr=new int[2*newarr.length];
      System.arraycopy(newarr, 0, arr, 0, Top+1);
    }

    public static void main(String[] args) {
        Stack_In_Array s = new Stack_In_Array(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
      
    }
}
