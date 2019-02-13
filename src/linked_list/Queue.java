package linked_list;

import java.util.NoSuchElementException;

public interface Queue<T> {

    int size();

    boolean isEmpty();
    
    void enqueue(T element);
    
    T front() throws NoSuchElementException;

    

    T dequeue() throws NoSuchElementException;
    
}
