import java.util.Scanner;

public class Task3 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1st number");
    float num1 = sc.nextFloat();
    System.out.println("Enter 2nd number");
    float num2 = sc.nextFloat();
    System.out.println("Enter 3rd number");
    float num3 = sc.nextFloat();
    
    float max = num1;
    if (num2 > max) {
      max = num2;
    }
    if (num3 > max) {
      max = num3;
    }
    
    float min = num1;
    if (num2 < min) {
      min = num2;
    }
    if (num3 < min) {
      min = num3;
    }
    
    System.out.printf("Maximum number: %.2f\n", max);
    System.out.printf("Minimum number: %.2f\n", min);
  }
}