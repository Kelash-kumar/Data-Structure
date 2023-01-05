package Array_practices;


class Nodde{
    int data;
    Nodde next;

    Nodde (int data){
        this.data=data;
    }

    public void insert(Nodde start,int data){
        Nodde newnoNode =new Nodde(data);
        if(start==null){
start=newnoNode;
return;
        }

        Nodde p=start;
        while(p.next!=null){
            p=p.next;
        }
        p.next=newnoNode;
    }

    public void display(Nodde start){
        if(start==null){
            return;
        }

        Nodde p=start;
        while(p!=null){
            System.out.print(p.data+" ");
            p=p.next;
        }
    }

    public void copyList(Nodde start, Nodde newList){
    if(start==null){

    }

    int k=1;
    while(k<=3){
        for(Nodde i=start;i!=null;i=i.next){
           newList.insert(newList, i.data);
        }
        k++;
    }
    }
}
public class classnode {
    public static void main(String[] args) {
        Nodde strart=new Nodde(12);
        Nodde p=strart;
        p.insert(strart, 12);
        p.insert(strart, 12);
        p.insert(strart, 12);
        p.display(strart);
        Nodde nnewlsit=new Nodde(1);
        nnewlsit.copyList(strart, nnewlsit);
        nnewlsit.display(nnewlsit);
    }
}
