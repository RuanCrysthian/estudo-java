package linkedlist.circular;

public class Main {
  public static void main(String[] args) {
    CircularList list = new CircularList();
    list.addAtBeginning(2);
    list.addAtBeginning(1);
    list.addAtEnd(4);
    list.addAtMiddle(3, 3);
    list.printList();
    list.delete(2);
    System.out.println("\n");
    list.printList();
  }
}
