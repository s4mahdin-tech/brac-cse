import java.util.Scanner;

public class Task3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        
    System.out.print("Start: ");
    int start = sc.nextInt();
    System.out.print("End: ");
    int end = sc.nextInt();
        
    System.out.println("Prime numbers between " + start + " and " + end + ":");
        
    for (int number = start; number <= end; number++) {
        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        }
        else {                
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break; 
                }
            }
        }
        if (isPrime) {
            System.out.println(number);
        }
    }
  }
}