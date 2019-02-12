package sit.base;

import java.util.NoSuchElementException;

public interface Queue<T> {

    int size();

    boolean isEmpty();

    T front() throws NoSuchElementException;

    void enqueue(T element);

    T dequeue() throws NoSuchElementException;
    
}
