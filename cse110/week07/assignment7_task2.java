import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    int size = sc.nextInt();
    int arr1[] = new int[size];
    
    for (int i = 0; i < size; i++) {
      System.out.println("Enter a number");      
      arr1[i] = sc.nextInt();     
    }
    
    System.out.println("Enter a number");
    int a = sc.nextInt();
    
    for (int j = 0; j < size; j++) {
      if (a == arr1[j]) {
        System.out.println(arr1[j] + " is at index " + j);
        return;
      }
    }
    
    System.out.println("Element not found");
  }
}