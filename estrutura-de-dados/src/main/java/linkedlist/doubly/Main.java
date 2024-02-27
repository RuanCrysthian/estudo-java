package linkedlist.doubly;

public class Main {
  public static void main(String[] args) {
    DoublyLinkedList list = new DoublyLinkedList();
    list.addAtBeginning(4);
    list.addAtBeginning(2);
    list.addAtBeginning(1);
    list.addAtEnd(5);
    list.addAtMiddle(3, 3);
    list.printList();
    list.deleteFirstNode();
    // System.out.println("\n");
    list.printList();
    System.out.println(list.search(4));
    list.delete(4);
    list.printList();
    System.out.println(list.search(4));
  }
}
