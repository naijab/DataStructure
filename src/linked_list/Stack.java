package linked_list;

import java.util.EmptyStackException;

public interface Stack<T> {
    
    int size();
    
    boolean isEmpty();
    
    
    void push (T element);
    
    T top() throws EmptyStackException;
    
    
    
    T pop() throws EmptyStackException;
    
}
