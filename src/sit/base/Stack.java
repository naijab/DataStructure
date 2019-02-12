package sit.base;

import java.util.EmptyStackException;

public interface Stack<T> {
    
    int size();
    
    boolean isEmpty();
    
    T top() throws EmptyStackException;
    
    void push (T element);
    
    T pop() throws EmptyStackException;
    
}
