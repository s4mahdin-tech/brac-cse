import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = 0;
    
    System.out.println("Please enter the length of array 1: ");
    int n1 = sc.nextInt();
    int[] arr1 = new int[n1];
    for (int i = 0; i < n1; i++) {
      arr1[i] = sc.nextInt();
    }
    
    System.out.println("Please enter the length of array 2: ");
    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];
    for (int i = 0; i < n2; i++) {
      arr2[i] = sc.nextInt();
    }
    
    for (int i = 0; i < n2; i++) {
      for (int j = 0; j < n1; j++) {
        if (arr2[i] == arr1[j]) {
          count++;
          continue;
        }
      }
    }
    
    if (count == n2) {
      System.out.println("Array 2 is a subset of Array 1. ");
    }
    else {
      System.out.println("Array 2 is not a subset of Array 1. ");
    }
  }
}