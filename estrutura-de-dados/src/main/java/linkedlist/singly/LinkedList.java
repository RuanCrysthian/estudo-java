package linkedlist.singly;

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
    if (head == null) {
      addAtBeginning(data);
      return;
    }

    Node current = head;
    while (current.getNext() != null) {
      current = current.getNext();
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
      currentPosition++;
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

  public void deleteFromBeginning() {
    if (head == null) {
      return;
    }
    head = head.getNext();
  }

  public void deleteFromEnd() {
    if (head == null) {
      return;
    }
    Node currentNode = head;
    while (currentNode.getNext() != null) {
      if (currentNode.getNext().getNext() == null) {
        currentNode.setNext(null);
        return;
      }
      currentNode = currentNode.getNext();
    }
  }

  public int size() {
    int sizeCount = 0;
    Node currentNode = head;
    while (currentNode != null) {
      sizeCount += 1;
      currentNode = currentNode.getNext();
    }
    return sizeCount;
  }

  public Node findByData(int data) {
    Node currentNode = head;
    Node returnNode = null;
    while (currentNode != null) {
      if (currentNode.getData() == data) {
        returnNode = currentNode;
      }
      currentNode = currentNode.getNext();
    }
    return returnNode;
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
