package Linked_List;


public class doublyLinkedList {
    Node head, tail = null;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

        Node(Node prev, int data, Node next) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

    }
//insetion at first:
    public void addAtFirst(int data) {

        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
        }

        else {
            head.prev = newnode;
            newnode.next = head;
            head = newnode;
        }
    }
//insetion at last :
public void addAtLast(int data){
    Node newnode = new Node(data);
    if (head == null) {
        head = newnode;
        tail = newnode;
    return;
    }

Node temp=head;
while(temp.next!=null){
    temp=temp.next;
}
temp.next=new Node(temp.prev, data, temp.next);

}
//insetoion at random position :

public void insetionRandom(int data,int index){
Node newNode=new Node( data);
    if(head==null){
        head=newNode;
        tail=newNode;
        return;
    }

int count=1;

Node temp=head;
Node currentNode=temp.next;
while(temp!=null){
     
    if(count==index){
  newNode.prev=temp;
  newNode.next=currentNode;
  temp.next=newNode;
  currentNode.prev=newNode;
    }
    count++;
    temp=temp.prev;
    currentNode=currentNode.next;
}


}

//to traverse alist 
    public void traverseList() {
        if (head == null) {
            System.out.println("oops your list is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            if (temp.next == null) {
                System.out.print("null");
            }
            temp = temp.next;
        }

    }

    public static void main(String[] args) {
        doublyLinkedList dll = new doublyLinkedList();
        dll.addAtFirst(3);
        dll.addAtFirst(2);
        dll.addAtFirst(1);
        
        dll.addAtLast(5);
        dll.addAtLast(6);
        dll.addAtLast(7);
        dll.addAtLast(12);
        // dll.insetionRandom(4, 4);
        dll.traverseList();
    }
}
