package linkedlist.circular;

public class CircularList {
  private Node head;

  public CircularList() {
    this.head = null;
  }

  public void addAtBeginning(int data) {
    Node newNode = new Node(data);

    if (head == null) {
      head = newNode;
      newNode.setNext(head);
    }

    newNode.setNext(head);
    Node current = head;

    while (current.getNext() != head) {
      current = current.getNext();
    }
    current.setNext(newNode);
    head = newNode;
  }

  public void addAtEnd(int data) {
    Node newNode = new Node(data);

    if (head == null) {
      head = newNode;
      newNode.setNext(head);
    }

    Node current = head;
    while (current.getNext() != head) {
      current = current.getNext();
    }
    current.setNext(newNode);
    newNode.setNext(head);
  }

  public void addAtMiddle(int data, int position) {
    Node newNode = new Node(data);
    if (position < 0)
      throw new IllegalArgumentException("Position Invalid!");
    Node current = head;
    int currentPosition = 1;
    while (current.getNext() != head && currentPosition < position - 1) {
      current = current.getNext();
      currentPosition++;
    }

    newNode.setNext(current.getNext());
    current.setNext(newNode);

    if (newNode == head)
      newNode.setNext(head);
  }

  public void delete(int data) {
    if (head == null)
      return;
    if (head.getData() == data) {
      deleteFirstNode();
    }
    Node current = head;
    Node previous = null;

    while (current.getNext() != head && current.getData() != data) {
      previous = current;
      current = current.getNext();
    }

    if (current.getData() == data) {
      assert previous != null;
      previous.setNext(current.getNext());
    } else
      System.out.println("Node not found!");

    if (current == head)
      head = head.getNext();
  }

  private void deleteFirstNode() {
    if (head == null)
      throw new IllegalArgumentException("List Empty!");
    int data = head.getData();

    if (head.getNext() == head)
      head = null;

    Node current = head;
    while (current.getNext() != head) {
      current = current.getNext();
    }
    current.setNext(head.getNext());
    head = head.getNext();
  }

  public void printList() {
    Node current = head;
    while (true) {
      System.out.print(" -> " + current.getData());
      current = current.getNext();
      if (current == head) {
        System.out.print(" -> ");
        return;
      }
    }
  }
}
