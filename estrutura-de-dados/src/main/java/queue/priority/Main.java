package queue.priority;

public class Main {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();
        priorityQueue.isEmpty();
        priorityQueue.enqueue(1, 1);
        priorityQueue.enqueue(2, 1);
        priorityQueue.enqueue(3, 1);
        priorityQueue.printPriorityQueue();
        priorityQueue.enqueue(0, 2);
        priorityQueue.printPriorityQueue();
        System.out.println("The size is " + priorityQueue.getSize());
        System.out.println("The first is " + priorityQueue.front());
        priorityQueue.dequeue();
        priorityQueue.printPriorityQueue();
        System.out.println("The size is " + priorityQueue.getSize());
        System.out.println("The first is " + priorityQueue.front());
    }
}
