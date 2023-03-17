
import Queue_data_structure.Queue;

class Linked_Queue implements Queue{
    
    int size=0;
    Node front=null;
    Node back=null;
    class Node {
        Node next,Prev;
        Object data;
        Node(Object data){
           this.data=data;
           this.next=this.Prev=null;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public void push(Object obj) {
        Node newnode=new Node(obj);
        if(isEmpty()){
            front=back=newnode;
            size++;
            return;
        }

        back.next=newnode;
        newnode.Prev=back;
        back=newnode;
        size++;
    }

    @Override
    public Object remove() {
        if(isEmpty()){
            System.out.print("The queue is empty =>  ");
            return null;
        }

        Object first=front.data;
        front=front.next;
        size--;
        return first;
    }

    @Override
    public Object first() {
        if(isEmpty()){
            System.out.println("The queue is empty ");
            return null;
        }

        return front.data;
    }
    
}

public class FreeCode {
    public static void main(String[] args) {
     Linked_Queue lq=new Linked_Queue();
     lq.push("HI kelash kumar");   
     lq.push("I want to learn queue data structure with you ");   
     lq.push("Oh sure i can . ");
    // System.out.println(lq.first());
    System.out.println(lq.remove());
    System.out.println(lq.remove());
    System.out.println(lq.remove());
    System.out.println(lq.remove());

    }
}
