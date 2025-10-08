import java.util.Arrays;

public class Task5 {
  public static void main(String[] args) {
    int[] marks = {85, 90, 75, 44, 99};
    String[] names = {"Bob", "Alice", "Max", "Marry", "Rosy"};
    int size = marks.length;
   
    for (int i = 0; i < size - 1; i++) {
      for (int j = 0; j < size - 1; j++) {
        int temp = 0;
        if (marks[j] > marks[j + 1]) {
          temp = marks[j];
          marks[j] = marks[j + 1];
          marks[j + 1] = temp;
         
          String s1 = names[j];
          names[j] = names[j + 1];
          names[j + 1] = s1;
        }
      }
    }
    
    System.out.println("Sorted array");
    for (int i = 0; i < size; i++) {
      System.out.print(marks[i] + " ");
    }
    System.out.println();
    for (int i = 0; i < size; i++) {
      System.out.print(names[i] + " ");
    }
  }
}