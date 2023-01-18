package stack_data_Structure;

import java.util.ArrayList;

class  stack{

 static ArrayList<Integer> list=new ArrayList<>();
    public static boolean isEmpty(){
     return list.size()==0;
    }

    //push:
    public static void push(int data){
         list.add(data);
    }

    //pop
    public static int pop(){
        if(isEmpty())return -1;
        int top=list.get(list.size()-1);
        list.remove(top);
        return top;
    }
    //peek
    public static int peek(){
        if(isEmpty())return -1;

        return list.get(list.size()-1);
        
    }
}

public class stack_by_ArrayList {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }   
    }
}