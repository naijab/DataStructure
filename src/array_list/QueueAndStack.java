package array_list;

import java.util.ArrayList;
import java.util.List;

public class QueueAndStack<T> implements Queue<T>, Stack<T> {

    private ArrayList<T> list;

    public QueueAndStack() {
        list = new ArrayList<>();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return list.get(0) == null;
    }

    @Override
    public void addQueue(T item) {
        list.add(item);
    }

    @Override
    public T removeQueue() {
        T removedItem = list.get(0);
        list.remove(0);
        return removedItem;
    }

    @Override
    public T frontOfQueue() {
        return list.get(0);
    }

    @Override
    public void addStack(T item) {
        list.add(item);
    }

    @Override
    public T removeStack() {
        T removedItem = list.get(lastPosition());
        list.remove(lastPosition());
        return removedItem;
    }

    @Override
    public T topOfStack() {
        return list.get(lastPosition());
    }

    public List<T> getList() {
        return list;
    }

    private int lastPosition() {
        return list.size() - 1;
    }

}
