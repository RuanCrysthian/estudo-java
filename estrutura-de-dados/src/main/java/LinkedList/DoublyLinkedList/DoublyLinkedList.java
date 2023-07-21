package LinkedList.DoublyLinkedList;

public class DoublyLinkedList {
    private Node head;

    public DoublyLinkedList() {
        this.head = null;
    }

    public void addAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        if (head != null)
            head.setPrevious(newNode);
        head = newNode;
    }

    public void addAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null)
            head = newNode;
        Node current = head;
        while (current.getNext() != null)
            current = current.getNext();
        current.setNext(newNode);
        newNode.setPrevious(current);
    }

    public void addAtMiddle(int data, int position) {
        Node newNode = new Node(data);
        if (position < 1)
            throw new IllegalArgumentException("Position Invalid");
        Node current = head;
        int currentPosition = 1;
        while (current.getNext() != null && currentPosition < position - 1) {
            current = current.getNext();
            currentPosition ++;
        }
        newNode.setNext(current.getNext());
        newNode.setPrevious(current);
        if (current.getNext() != null)
            current.getNext().setPrevious(newNode);
        current.setNext(newNode);
    }

    public void printList() {
        if (head == null)
            return;
        Node current = head;
        while (current != null) {
            System.out.print(" <--> " + current.getData());
            current = current.getNext();
        }
        System.out.print(" <--> \n");
    }

    public void deleteFirstNode() {
        if (head == null)
            return;
        head = head.getNext();
        if (head != null)
            head.setPrevious(null);
    }

    public void delete(int data) {
        if (head == null)
            return;
        if (head.getData() == data) {
            head = head.getNext();
            if (head != null)
                head.setPrevious(null);
            return;
        }

        Node current = head;
        while (current != null && current.getData() != data)
            current = current.getNext();
        if (current != null) {
            current.getPrevious().setNext(current.getNext());
            if (current.getNext() != null)
                current.getNext().setPrevious(current.getPrevious());
        }
    }

    public boolean search(int data) {
        Node current = head;
        while (current != null) {
            if (current.getData() == data)
                return true;
            current = current.getNext();
        }
        return false;
    }

}
