package Linked_List;


class LL{
     static node head;
     int size=0;
    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
        node(int data,node next){
            this.data=data;
            this.next=next;
        }
    }

    public  void insetionATLast(int data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
            ++size;
            return;
        }


        node temp=head;
while(temp.next!=null)
temp=temp.next;
temp.next=new node(data, temp.next);
++size;
    }

    public int middleElement(){
        int mid=size/2;
        if(head==null)return -1;

    node temp=head;
    while(mid>0){
        temp=temp.next;
        mid--;
    }
    return temp.data;
    }
}
public class middleElement {
 public static void main(String[] args) {
    LL l1=new LL();
    l1.insetionATLast(1);
    l1.insetionATLast(3);
    l1.insetionATLast(4);
    l1.insetionATLast(5);
    l1.insetionATLast(6);
    l1.insetionATLast(9);
System.out.println("\n"+l1.middleElement());   
 }   
}
