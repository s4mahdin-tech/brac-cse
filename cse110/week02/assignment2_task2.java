import java.util.Scanner;

public class Task2 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your payment");
    int pay = sc.nextInt();
    System.out.println("Enter your age");
    int age = sc.nextInt();
    
    if (age < 18 || pay < 10000) {
      System.out.println("Your tax amount is 0");
    }
    else if (pay > 10000 && pay < 20000) {
      System.out.println("Your tax amount is 750");
    }
    else if (pay > 20000) {
      System.out.println("Your tax amount is 3000");
    }
  }
}