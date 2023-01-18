package Linked_List;

class linkedList {
    Node head;
    private int size = 0;

    class Node {
        int data;// pointing the data of head
        Node next; // poinnting the next elemet of head

        Node(int data) {
            this.data = data;
            this.next = null; // iniatially it create null list
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next; // iniatially it create null list
        }
    }

    public int sizzeOfList() {
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;     
    }

    // Add operation in linked list;
    // two type
    // i) add at first
    // ii) add at last
    public void addAtFirst(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }

        newnode.next = head;// newnode's-> next points to the head
        head = newnode; // head assign as newnode

    }

    // add at last :
    public void addAtLast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }

        // traverse the head;
        Node CurrentNode = head; // assign the value head to a head variable;
        while (CurrentNode.next != null) {
            CurrentNode = CurrentNode.next;
        }
        CurrentNode.next = newnode;
    }

    // insert at specific poisition:
    public void insertion(int data, int index) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            return;
        }
        if (index == 1) {
            addAtFirst(data);

        }
        Node p = head;
        for (int i = 1; i < index; i++) {
            p = p.next;
        }
        n.next = p.next;
        p.next = n;
        // p.next=new Node(data, p.next);

    }

    // print list ;
    public void PrintList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currentNode = head;
        while (currentNode != null) {
            System.out.print(currentNode.data + " -> ");
            currentNode = currentNode.next;
        }

        System.out.println("Null");
    }

    public void deleteAtFirst() {
        if (head == null) {
            System.out.println("list is epmty");
            return;
        }

        head = head.next;
    }

    public void deleteAtLast() {
        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }
        Node secondlast = head;
        Node lastnode = head.next; // head.next=null -> lastnode=null;
        while (lastnode.next != null) {
            lastnode = lastnode.next;// null.next have no scense; that why we use second if condtition;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }

    public void deleteAnyValue(int data) {
        Node p = head;

        while (p.next != null) {
            if (p.next.data == data) {
                p.next = p.next.next;
                return;
            }
            p = p.next;
        }
    }

    public void deleteAtIndex(int index) {
        Node temp = head;
        int count = 1;
        if (head == null) {
            System.out.println("List is Epmty");
            return;
        }

        if (index == 0) {
            head = head.next;
            return;
        }

        else {
            for (int i = 1; i < index; i++) {
                temp = temp.next;
                count++;
            }
            temp.next = temp.next.next;
        }
    }

    public void middleElement() {
        if (head == null) {
            System.out.println("List is empty ");
            return;
        }

        Node pnext = head;
        int n = sizzeOfList();
        int middle_Element = n / 2;
        while (middle_Element != 0) {
            pnext = pnext.next;
            middle_Element--;
        }
        System.out.println("Middle element is = " + pnext.data);

    }

    public boolean compareEqualLists( linkedList list2) {

      if(this.head==null || list2.head==null)return false;

      Node p=this.head;
      Node q=list2.head;
      while(p!=null && q!=null){
        if(p.data!=q.data)return false;
        p=p.next;
        q=q.next;
      }
        return true;
    }

    public Node reverse_list() {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

}

public class basicOperationOfLL {
    public static void main(String[] args) {

        linkedList list = new linkedList();
        // adding at first of node list
        list.addAtFirst(5);
        list.addAtFirst(4);
        list.addAtFirst(3);
        list.addAtFirst(2);
        list.addAtFirst(1);
        // adding to the last of node list;
        list.addAtLast(6);
        list.addAtLast(7);
        list.addAtLast(8);
        list.addAtLast(9);
        list.addAtLast(10);
        list.addAtLast(12);
        list.addAtLast(15);
        // adding at the given position:
        list.insertion(11, 10);
        list.insertion(13, 12);
        list.insertion(14, 13);
        System.out.println("calling the list \n");
        list.PrintList();
        list.middleElement();
        System.out.println("calling after insertion\n");
        list.addAtFirst(0);
        list.addAtLast(312);
        list.insertion(123, 9);
        list.insertion(1233, 12);

        list.PrintList();
        System.out.println("\nnow we will delete these unstructred element in list to make is sorted like 0,123,312 ");
        list.deleteAtIndex(9);
        list.deleteAtFirst();
        list.deleteAtLast();
        list.deleteAnyValue(1233);
        list.PrintList();
        System.out.println("\n now make in reverse list ");
        list.reverse_list();
        list.PrintList();
        System.out.println(list.sizzeOfList());

        linkedList list1 = new linkedList();
        linkedList list2 = new linkedList();
        list1.addAtFirst(1);
        list1.addAtFirst(2);
        list1.addAtFirst(14);
        list1.addAtFirst(15);
        System.out.println(list1.sizzeOfList());
        list2.addAtFirst(1);
        list2.addAtFirst(2);
        list2.addAtFirst(14);
        list2.addAtFirst(15);

System.out.println("comparsion of lists => "+list1.compareEqualLists(list2));
list1.PrintList();
list2.PrintList();
    }
}
