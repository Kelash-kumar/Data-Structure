package Linked_List;

public class doublyLinkedList {
    Node head, tail = null;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) { // constructor in set the values
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        Node(Node prev, int data, Node next) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }

    }

    // insetion at first:
    public void addAtFirst(int data) { // INSERTING AT THE STATING OF LIST

        Node newnode = new Node(data);
        newnode.next = head;
        newnode.prev = null;
        if (head != null)
            head.prev = newnode;

        head = newnode;
    }

    // insetion at last :
    public void addAtLast(int data) {

        Node newnode = new Node(data);
        newnode.next = null; // since newnode=lastnode

        if (head == null) {
            newnode.prev = null;
            head = newnode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        // temp.next=new Node(temp.prev, data, temp.next);
        temp.next = newnode;
        newnode.prev = temp;

    }

    // insetoion at random position :
    public void insetionRandom(int data, int index) {
        Node newNode = new Node(data); // creating a new node
        if (head == null) { // checks if head is null
            head = newNode;
            tail = newNode;
            return;
        }
        index = index - 1;
        int count = 1; // counter to count the number of nodes data;

        Node tempprev = head;
        Node tempNext = tempprev.next;
        while (tempprev.next != null) {
            if (count == index) {
                newNode.prev = tempprev; // step -1
                newNode.next = tempNext; // step -2
                tempprev.next = newNode; // step -3
                tempNext.prev = newNode; // step -4
            }
            tempprev = tempNext; // get previous node
            tempNext = tempNext.next; // get next node
            count++;
        }

    }

    // to traverse alist in forward direction
    public void traverse() {
        Node temp = head;

        if (head == null) {
            System.out.println("oops your list is empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + " -> ");

            if (temp.next == null) {
                System.out.println("null");
            }
            temp = temp.next;
        }

    }

    // searching value in a list:
    public void searchingElement(int value) {

        int index = 1;
        if (head == null) {
            System.out.println("list is empty ");
            return;
        }
        Node current = head;
        while (current.next != null) {

            if (current.data == value) {
                System.out.println("you searched data is at index : " + index);
                return;
            }
            index++;
            current = current.next;
        }
        System.out.println("your searched element is not pressent in the list ");
    }

    // to delete any node in the list :
    public void deleteElement(int value) {
        if (head == null) {
            System.out.println("list is empty ");
            return;
        }

        Node current = head;

        // to delete at first node:
        if (current.data == value) {
            current.next.prev = null;
            head = current.next;
            return;
        }
        while (current.next != null) {

            // to delete last node:
            if (current.next.next == null && current.next.data == value) {
                current.next = null;
                return;
            }
            if (current.next.data == value) {
                Node temp = current.next.next;
                current.next = temp;
                temp.prev = current;
                return;
            }
            current = current.next;
        }

    }

    public static void main(String[] args) {
        doublyLinkedList dll = new doublyLinkedList();
        // inseting first four element
        dll.addAtFirst(4);
        dll.addAtFirst(3);
        dll.addAtFirst(2);
        dll.addAtFirst(1);
        // inseting at last possition or tail of list
        dll.addAtLast(6);
        dll.addAtLast(7);
        dll.addAtLast(8);
        dll.addAtLast(10);

        // inserting at rendom position:
        dll.insetionRandom(5, 5);
        dll.insetionRandom(9, 9);
        // traving the list in forward diraction:
        // searching the specific element:
        // dll.searchingElement(0);
        // dll.searchingElement(9);
        dll.deleteElement(1);
        dll.traverse();
        dll.deleteElement(2);
        dll.traverse();

    }
}
