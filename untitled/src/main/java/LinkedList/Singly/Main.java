package LinkedList.Singly;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addAtBeginning(3);
        list.addAtBeginning(1);
        list.addAtEnd(4);
        list.addAtMiddle(2, 2);

        list.printList();

        list.delete(3);
        list.printList();
    }
}
