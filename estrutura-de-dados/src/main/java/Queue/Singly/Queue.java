package Queue.Singly;

public class Queue {
    private Node first;
    private Node last;
    private int size;

    public Queue() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty())
            first = newNode;
        else
            last.setNext(newNode);
        last = newNode;
        size ++;
    }

    public void dequeue() {
        if (isEmpty())
            return;
        first = first.getNext();
        size --;
    }

    public int front() {
        if (isEmpty())
            throw new IllegalArgumentException("Queue is empty!");
        return first.getData();
    }

    public int getSize() {
        return size;
    }

    public void printQueue() {
        Node current = first;
        while (current != null) {
            System.out.print(current.getData() + " <- ");
            current = current.getNext();
        }
        System.out.print("\n");
    }
}
