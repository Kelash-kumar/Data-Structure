package Queue_data_structure;

class ArrayQueue implements Queue {
    private Object[] array;
    private int size;
    private int rare = -1;

    ArrayQueue(int size){
        this.size=size;
        array=new Object[size];
    }

    public boolean isEmpty() {
        return rare == -1;
    }
    public boolean isFull(){
        return size==array.length;
    }

    public void push(Object obj) {
        if (rare == array.length) {
            System.out.println("full");
        }

        rare++;
        array[rare] = obj;
    }

    public Object remove() {
        if (isEmpty()) {
            System.out.println("null");
            return null;
        }

        Object front = array[0];
        for (int i = 0; i < rare; i++) {
            array[i] = array[i + 1];
        }
        rare--;
        // size--;

        return front;
    }

    public int size() {
        return size;
    }

    public Object first() {
        if (isEmpty()) {
            System.out.println("null");
            return null;
        }
        
        return array[0];
    }
    
    public void print_ArrayQueue(){
        if (isEmpty()) {
            System.out.println("null");
            return ;
        }

        for(int i=0;i<=rare;i++){
            System.out.print(array[i]+" <- ");
        }
        System.out.print("null");
        
    }
}

public class Arrya_Queue {
    public static void main(String[] args) {
    //    ArrayQueue aq=new ArrayQueue(10);
       myqueue aq=new myqueue(3);
         aq.push("kelash");
         aq.push("Devraj");
         aq.push("Vijay");
         aq.push("Vijay");
        //  aq.push("Vijay");
         System.out.println(aq.first());
        //  System.out.println(aq.remove());
        //  aq.print_ArrayQueue();
      
    }
}

// other way :

class myqueue implements Queue{
int size=0;
int front=-1;
int back=-1;
Object[] QueueList;
myqueue(int Capacity){
    QueueList=new Object[Capacity];
}
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public boolean isFull() {
        return size==QueueList.length;
    }

    public void push(Object obj) {
if(isEmpty()){
    front=back=0;
    QueueList[back]=obj;
    size++;
    return;
}
if(isFull()){
    System.out.println("The Queue is full ");
    return;
}

QueueList[++back]=obj;
size++;

    }

    public Object remove() {
        if(isEmpty())return  null; 
return QueueList[front++];
    }

    public Object first() {
     if(isEmpty())return null;
     
        return QueueList[front];
    }
    
}