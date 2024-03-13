package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayLists {

  public static void main(String[] args) {

    // Creation
    // Time Complexity O(1)
    // Space Complexity O(n)
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30));
    System.out.println(numbers);

    // Insert
    // Time Complexity O(1) without index
    // Time Complexity O(n) with index
    // Space Complexity O(n)
    numbers.add(40);
    System.out.println(numbers);
    numbers.add(0, 0);
    System.out.println(numbers);

    // Accessing Elements
    // Time Complexity O(1)
    // Space Complexity O(1)
    System.out.println(numbers.get(0));
    System.out.println(numbers.get(3));

    // Traversal ArrayList
    // Time Complexity O(n)
    // Space Complexity O(1)
    for (Integer num : numbers) {
      System.out.println(num);
    }
    System.out.println("-------");
    Iterator<Integer> iterator = numbers.iterator();
    while (iterator.hasNext()) {
      Integer num = iterator.next();
      System.out.println(num);
    }

    // Search for an Element
    // Time Complexity O(n)
    // Space Complexity O(1)
    for (Integer num : numbers) {
      if (num == 20) {
        System.out.println("The element is found");
        break;
      }
    }
    System.out.println("The 20 is found at " + numbers.indexOf(20) + " position");

    // Delete an Element
    // Time Complexity O(n)
    // Space Complexity O(1)
    ArrayList<String> stringList = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E"));
    stringList.remove("D");
    stringList.remove(3);
    System.out.println(stringList);
  }
}
