package stack_data_Structure;

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
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(9);
        s.push(10);
        // s.pop();
        s.traverse_Stack();
        // System.out.println(s.peek());
    }
}
