package Linked_List;

public class linkedList {
    Node head;
    class Node {
        String data;// pointing the data of node
        Node next; // poinnting the next elemet of node

        Node(String data) {
            this.data = data;
            this.next = null; // iniatially it create null list
        }
    }

    // Add operation in linked list;
    // two type
    // i) add at first
    // ii) add at last
    public void addAtFirst(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }

        newnode.next=head;//newnode's-> next points to the head
        head=newnode;  //head assign as newnode

    }

    public void addAtLast(String data){
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }

//traverse the node;
Node CurrentNode=head; //assign the value head to a node variable;
while(CurrentNode.next!=null){
    CurrentNode=CurrentNode.next; 
}
CurrentNode.next=newnode;
    }


    // print list ;
    public void PrintList(){
        if(head==null){
            System.out.println("list is empty");
       return; 
        }
       Node currentNode=head;
       while(currentNode!=null){
System.out.print(currentNode.data+" -> ");
currentNode=currentNode.next;
       }

System.out.println("Null");
    }
    public static void main(String[] args) {
        linkedList list = new linkedList();
        list.PrintList();// list is empty;
        list.addAtFirst(" a");
        list.addAtFirst(" is");
        list.addAtLast(" linked list");
        list.addAtFirst(" This");
        list.PrintList();

    }
}
