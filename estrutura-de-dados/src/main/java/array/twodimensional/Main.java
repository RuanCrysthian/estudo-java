package array.twodimensional;

public class Main {

  public static void main(String[] args) {
    TwoDimensionalArray sda = new TwoDimensionalArray(2, 2);
    sda.insertValueInTheArray(0, 0, 10);
    sda.insertValueInTheArray(0, 1, 20);
    sda.insertValueInTheArray(1, 0, 30);
    sda.insertValueInTheArray(1, 1, 40);
    sda.accessCell(0, 1);
    sda.traverse2DArray();
    sda.searchingValue(50);
    sda.deleteValueFromArray(1, 0);
    sda.traverse2DArray();
//    System.out.println(Arrays.deepToString(sda.arr));
  }
}
