import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of array");
    int size = sc.nextInt();
    double arr1[] = new double[size];
    
    for (int i = 0; i < size; i++) {
      System.out.println("Enter a number");      
      arr1[i] = sc.nextDouble();     
    }
    
    double max = 0.0;
    double min = 0.0;
    int max_index = 0;
    int min_index = 0;
    double sum = 0.0;
    double avg = 0.0;
    
    for (int i = 0; i < size; i++) {
      if (arr1[i] > max) {
        max = arr1[i];
        max_index = i;
      }
      if (arr1[i] < min) {        
        min = arr1[i];
        min_index = i;
      }
      sum += arr1[i];      
    }
    
    avg = sum / size;
    System.out.println("Maximum element " + max + " found at index " + max_index);
    System.out.println("Minuimum element " + min + " found at index " + min_index);
    System.out.println("Summation: " + sum);                           
    System.out.printf("Average: " + "%.2f", avg);                                
  }
}