package linkedlist.singly;

public class Main {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();

    System.out.println("The linked list is empty? " + list.isEmpty());

    System.out.println("--------");
    list.addAtEnd(4);
    list.printList();
    System.out.println("The size is: " + list.size());

    System.out.println("--------");

    list.addAtBeginning(3);
    list.addAtBeginning(1);
    list.addAtMiddle(2, 2);
    list.printList();
    System.out.println("The size is: " + list.size());

    System.out.println("--------");

    System.out.println("Delete the node that data is 3");
    list.delete(3);
    list.printList();
    System.out.println("The linked list is empty? " + list.isEmpty());

    System.out.println("Search for Node that data is 2: " + list.findByData(2));
    System.out.println("Search for Node that data is 3: " + list.findByData(3));

    System.out.println("Delete the first node");
    list.deleteFromBeginning();
    list.printList();
    System.out.println("The size is: " + list.size());

    System.out.println("Delete the last node");
    list.deleteFromEnd();
    list.printList();
    System.out.println("The size is: " + list.size());

  }
}
