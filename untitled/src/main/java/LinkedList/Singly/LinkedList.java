package LinkedList.Singly;

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
    }

    public void addAtEnd(int data) {
        Node newNode = new Node(data);
        if(head == null) { // se a lista for vazia adiciona ali mesmo
            head = newNode;
            return;
        }

        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext(); // percorrendo a lista
        }

        current.setNext(newNode);
    }

    public void addAtMiddle(int data, int position) {
        Node newNode = new Node(data);

        if (head == null) {
           addAtBeginning(data);
           return;
        }

        if (position < 1) {
            throw new IllegalArgumentException("Position Invalid");
        }

        if (position == 1) {
            addAtBeginning(data);
            return;
        }

        Node current = head;
        int currentPosition = 1;

        while (current.getNext() != null && currentPosition < position - 1) {
            current = current.getNext();
            currentPosition ++;
        }

        if (currentPosition < position - 1) {
            throw new IllegalArgumentException("Position not found");
        }

        newNode.setNext(current.getNext());
        current.setNext(newNode);
    }

    public void delete(int data) {
        if (head == null)
            return;

        if (head.getData() == data) {
            head = head.getNext();
            return;
        }

        Node current = head;
        while (current.getNext() != null) {
            if (current.getNext().getData() == data) {
                current.setNext(current.getNext().getNext());
                return;
            }
            current = current.getNext();
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getData() + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
