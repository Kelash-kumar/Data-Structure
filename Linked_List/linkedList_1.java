package Linked_List;

public class linkedList_1 {
    Node head;
    Node tail=null;//for doubly linked list

    class Node {

        int data;
        Node next;
        Node prev;//for DLL

        // constructor
        Node(int data) {
            this.data = data;
            this.next = next;
            this.prev = prev; 

        }
    }

    public void addAtFirst(int data) {
        Node p = new Node(data);

        if (head == null) {
            head = p;
            tail=p;
            return;
        }

        else {
            head.prev=p;  //for DLL
            p.next = head;
            head = p;
        }

    }

    public void display(){

        if(head==null){
           System.out.println("List is empty");
            return;
        }

        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public interface InnerlinkedList_1 {
    
        
    }

    public static void main(String[] args) {
       linkedList_1 l1=new linkedList_1();
       l1.addAtFirst(10);
       l1.addAtFirst(20);
       l1.addAtFirst(30);
       l1.addAtFirst(40);
       l1.addAtFirst(50);
       l1.display();
        
    }

}
