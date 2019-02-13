package linked_list;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class QueueAndStackImpl<T> implements Queue<T>, Stack<T> {

    private int size;
    private Node<T> first;
    private Node<T> last;

    private static class Node<T> {
        private T element;
        private Node<T> next;
    }

    public QueueAndStackImpl() {
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public T front() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return first.element;
    }

    @Override
    public void enqueue(T element) {
        Node<T> oldlast = last;
        last = new Node<>();
        last.element = element;
        last.next = null;
        if (isEmpty()) {
            first = last;
        } else {
            oldlast.next = last;
        }
        size++;
    } 

    @Override
    public T dequeue() throws NoSuchElementException {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        T item = first.element;
        first = first.next;
        size--;
        if (isEmpty()) {
            last = null;
        }
        return item;
    } 

    @Override
    public T top() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return first.element;
    }

    @Override
    public void push(T element) {
        Node<T> oldfirst = first;
        first = new Node<>();
        first.element = element;
        first.next = oldfirst;
        size++;
    }

    @Override
    public T pop() throws EmptyStackException {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T element = first.element;
        first = first.next;
        size--;
        return element;
    }

}
