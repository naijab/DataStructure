package array_list;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n================================");
        System.out.println("Queue");
        System.out.println("================================");
        QueueAndStack<String> students = new QueueAndStack<>();
        students.addQueue("John");
        students.addQueue("Kom");
        students.addQueue("Nitro");
        students.addQueue("Bibe");
        students.addQueue("Jimmy");
        System.out.println("Before Remove First: " + students.frontOfQueue());
        System.out.println("Before List: " + students.getList());
        System.out.println("Remove Queue: " + students.removeQueue());
        System.out.println("After Remove First: " + students.frontOfQueue());
        System.out.println("After List: " + students.getList());
        
        System.out.println("\n================================");
        System.out.println("Stack");
        System.out.println("================================");
        QueueAndStack<String> book = new QueueAndStack<>();
        book.addStack("Harry Potter");
        book.addStack("The Third Wave");
        book.addStack("Maze Runner");
        book.addStack("Thailand 5.5");
        book.addStack("Amazon");
        System.out.println("Before Remove Top: " + book.topOfStack());
        System.out.println("Before List: " + book.getList());
        System.out.println("Remove Top: " + book.removeStack());
        System.out.println("After Remove Top: " + book.topOfStack());
        System.out.println("After List: " + book.getList());
    }

}
