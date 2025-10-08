import java.util.Scanner;

public class Task9 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
     
    boolean prime = true;
     
    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        prime = false;
        break;
      }
    }
    
    int sum = 0;
    for (int j = 1; j < number; j++) {
      if (number % j == 0) {
        sum = sum + j;
      }
    }   
    
    if (prime == true && number != 1) {
      System.out.println(number + " is a prime number");
    }
    else {
      System.out.println(number + " is not a prime number");
    }
     
    if (number == sum) {
      System.out.println(number + " is a perfect number");
    }
    else {
      System.out.println(number + " is not a perfect number");
    }
  }
}