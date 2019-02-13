package array_list;

public interface Queue<T> {
    
    int size();
    
    boolean isEmpty();
    
    void addQueue(T item);
    
    T removeQueue();
    
    T frontOfQueue();
    
}
