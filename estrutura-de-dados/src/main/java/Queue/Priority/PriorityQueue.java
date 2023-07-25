package Queue.Priority;

public class PriorityQueue {
    private Node first;
    private int size;

    public PriorityQueue() {
        this.first = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int data, int priority) {
        Node newNode = new Node(data, priority);
        if(isEmpty() || priority > first.getPriority()) {
            newNode.setNext(first);
            first = newNode;
        }
        else {
            Node current = first;
            while(current.getNext() != null && priority <= current.getNext().getPriority())
                current = current.getNext();
            newNode.setNext(current.getNext());
            current.setNext(newNode);
        }
        size ++;
    }

    public void dequeue() {
        if(isEmpty())
            return;
        first = first.getNext();
        size --;
    }

    public int front() {
        if(isEmpty())
            throw new IllegalArgumentException("Queue is empty!");
        return first.getData();
    }

    public int getSize() {
        return size;
    }

    public void printPriorityQueue() {
        Node current = first;
        while (current != null) {
            System.out.print(current.getData() + " <- ");
            current = current.getNext();
        }
        System.out.print("\n");
    }
}
