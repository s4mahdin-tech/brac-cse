import java.util.Scanner;

public class Task8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    int pow = 1;
    int x = number;
    
    while (x > 9) {
      x = x / 10;
      pow *= 10;
    }
    
    int digit = 0;
     
    for (int i = pow; i > 0; i /= 10) {
      digit = number / i;
      number = number % i;
      
      if (i < 9) {
        System.out.print(digit + " ");
      }
      else {
        System.out.print(digit + ", ");
      }
    }
  }
}