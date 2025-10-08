import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    int size = sc.nextInt();
    int arr1[] = new int[size];
    int arr2[] = new int[size];
    
    for (int i = 0; i < size; i++) {
      System.out.println("Enter elements");      
      arr1[i] = sc.nextInt();
      if (arr1[i] > 0) {
        arr2[i] = 1;                     
      }
      else {
        arr2[i] = 0; 
      }
    }

    System.out.println("Orginal array: ");
    System.out.println(Arrays.toString(arr1));
    System.out.println("After modifying: ");
    System.out.println(Arrays.toString(arr2));
  }
}