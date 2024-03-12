package array.singledimensional;

public class Main {
  public static void main(String[] args) {
    SingleDimensionArray sda = new SingleDimensionArray(3);
    sda.insert(0, 10);
    sda.insert(1, 20);
    sda.insert(2, 30);
    int firstElement = sda.arr[0]; // O(1)
    System.out.println(firstElement);
    int thirdElement = sda.arr[3];
    System.out.println(thirdElement);
    sda.traverseArray();
    sda.searchInArray(10);
    sda.searchInArray(60);
    sda.deleteValue(0);
  }
}
