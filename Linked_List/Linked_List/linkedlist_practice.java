package Linked_List;

class Node {
    int data;// pointing the data of node
    Node next; // poinnting the next elemet of node

    Node(int data) {
        this.data = data;
        this.next = null; // iniatially it create null list
    }

    public void insertAtLast(int data,Node start){
       Node newnode=new Node(data);
        if(start==null){
start=newnode;
return;
        }


        Node p=start;
        while(p.next!=null) p=p.next;  //p value change if condition become true

        p.next=newnode;

    }

}
public class linkedlist_practice {
    public static void main(String[] args) {
        Node start=new Node(5);
        Node p=start;
        p.insertAtLast(6, start);  //insettion in list
        while(p!=null){
            System.out.println(p.data+" ");
            p=p.next;
        }
        
        start.insertAtLast(7, start);
    }
}
