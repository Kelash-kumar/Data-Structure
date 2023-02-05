
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }

    public void InsertAtFirst(Node start, int data) {
        Node newnoNode = new Node(data);
        if (start == null) {
            start = newnoNode;
            return;
        }

        newnoNode.next = start.next;
        start = newnoNode;
    }

    public void insertAtLast(Node start, int data) {
        Node newNode = new Node(data);
        if (start == null) {
            start = newNode;
            return;
        }

        Node p = start;
        while (p.next != null)
            p = p.next;
        p.next = newNode;

    }

    public void traverseList(Node start) {
        if (start == null) {
            System.out.println("list is empty");
            return;
        }
        Node temp = start;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public void insertionAtIndex(Node start, int index, int data) {
        Node newNode = new Node(data);
        int count = 0;
        if (start == null) {
            start = newNode;
            count++;
            return;
        }
        if (index == 0) {
            newNode.next=start;
            start=newNode;
            // InsertAtFirst(start, data);
            return;
        }
        Node temp = start;
        while (temp.next != null) {
            if (index - 1 == count) {
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            else if(temp.next==null){
                temp.next=newNode;
                return;
            }
            temp = temp.next;
            count++;
        }
    }
}

public class NodeListAllOperation {
    public static void main(String[] args) {
        Node start = new Node(10);
        // start.traverseList(start);
        start.insertAtLast(start, 20);
        start.insertAtLast(start, 30);
        start.insertAtLast(start, 40);
        start.insertionAtIndex(start, 8, 100);
        // start.InsertAtFirst(start, 100);
        // start.InsertAtFirst(start, 200);
        // start.InsertAtFirst(start, 300);
        start.traverseList(start);

    }
}
