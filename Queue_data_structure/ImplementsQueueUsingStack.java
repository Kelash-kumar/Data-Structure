package Queue_data_structure;

import stack_data_Structure.LinkedStack;

class MyQueue {
    LinkedStack stackobject_1=new LinkedStack();
    LinkedStack stackobject_2=new LinkedStack();
  
    public void push(Object x) {
        while(stackobject_1.size()!=0){
            stackobject_2.push(stackobject_1.pop());
        }
        
        stackobject_1.push(x); 
        
        while(stackobject_2.size()!=0){
            stackobject_1.push(stackobject_2.pop());
        }
        
    }
    
    public Object pop() {
        if(stackobject_1.size()==0)return null;


return stackobject_1.pop();
        
    }
    
    public Object peek() {
        if(stackobject_1.size()==0)return null;

      return stackobject_1.peek();
    }
    
    public boolean empty() {
        return stackobject_1.size()==0;
    }
}


public class ImplementsQueueUsingStack {
    public static void main(String[] args) {
        MyQueue my=new MyQueue();
        my.push("this");
        my.push("Queue");
        my.push("IS");
        my.push("stack");
        System.out.println(my.pop());
        System.out.println(my.pop());
        System.out.println(my.pop());
        System.out.println(my.pop());
        System.out.println(my.peek());
    }
}
