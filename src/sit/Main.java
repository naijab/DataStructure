package sit;

public class Main {

    public static void main(String[] args) {
        QueueAndStackImpl<Integer> stack = new QueueAndStackImpl<>();
        stack.push((Integer) 1);
        stack.push((Integer) 2);
        stack.push((Integer) 3);
        stack.push((Integer) 4);
        stack.push((Integer) 5);
        stack.push((Integer) 6);
        stack.pop();
        stack.pop();
        System.out.println("Stack Top: " + stack.top());

        QueueAndStackImpl<String> queue = new QueueAndStackImpl<>();
        queue.enqueue("John Koner");
        queue.enqueue("Michael Johnson");
        queue.enqueue("Quay Xi Xiu");
        queue.dequeue();
        queue.dequeue();
        System.out.println("Queue front: " + queue.front());
       
    }

}
