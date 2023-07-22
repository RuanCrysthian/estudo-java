package Stack;

public class Stack {
    private Node top;

    public Stack() {
        this.top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.setNext(top);
        top = newNode;
    }

    public int pop() {
        if (isEmpty())
            throw new IllegalArgumentException("Stack is empty");
        int data = top.getData();
        top = top.getNext();
        return data;
    }

    public int top() {
        if (isEmpty())
            throw new IllegalArgumentException("Stack is empty");
        return top.getData();
    }
    public void printStack() {
        Node current = top;
        while (current != null) {
            System.out.print(current.getData() + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
