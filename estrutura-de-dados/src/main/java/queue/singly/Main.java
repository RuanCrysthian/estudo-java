package queue.singly;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        System.out.println(queue.isEmpty());
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println("The first is: " + queue.front());
        System.out.println("The size of queue is " + queue.getSize());
        queue.printQueue();
        queue.dequeue();
        queue.printQueue();
        System.out.println("The first is: " + queue.front());
        System.out.println("The size of queue is " + queue.getSize());
    }
}
