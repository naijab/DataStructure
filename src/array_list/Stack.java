package array_list;

public interface Stack<T> {
    
    int size();
    
    boolean isEmpty();
    
    void addStack(T item);
    
    T removeStack();
    
    T topOfStack();
    
}
