package Queue_data_structure;

public interface Queue {

    int size();
    public boolean isEmpty();
    public boolean isFull();
    public void push(Object obj);
    public Object remove();
    public Object first();
}
