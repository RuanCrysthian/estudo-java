package queue.priority;

public class Node {
    private final int data;
    private final int priority;
    private Node next;

    public Node(int data, int priority) {
        this.data = data;
        this.priority = priority;
        this.next = null;
    }

    public int getData() {
        return data;
    }
    public int getPriority() {
        return priority;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }
}
