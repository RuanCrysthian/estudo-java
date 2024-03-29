package linkedlist.doubly;

public class Node {
  private final int data;
  private Node next;
  private Node previous;

  public Node(int data) {
    this.data = data;
    this.next = null;
    this.previous = null;
  }

  public int getData() {
    return data;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public Node getPrevious() {
    return previous;
  }

  public void setPrevious(Node previous) {
    this.previous = previous;
  }
}
