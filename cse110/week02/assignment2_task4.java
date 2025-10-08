import java.util.Scanner;

public class Task4 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter 1st side");
    int num1 = sc.nextInt();
    System.out.println("Enter 2nd side");
    int num2 = sc.nextInt();
    System.out.println("Enter 3rd side");
    int num3 = sc.nextInt();
    
    if (num1 == num2 && num2 == num3) {
      System.out.println("This is a Equilateral triangle");
    }
    else if (num1 == num2 || num2 == num3 || num1 == num3) {
      System.out.println("This is a Isosceles triangle");
    }
    else {
      System.out.println("This is a Scalene triangle");
    }
  }
}