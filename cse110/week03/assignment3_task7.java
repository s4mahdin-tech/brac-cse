import java.util.Scanner;

public class Task7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int n = sc.nextInt();
    
    boolean firstDigit = true;
     
    while(true) { 
      int p = n % 10;
      n = n / 10;
       
      if(p == 0) {
        break;
      }
       
      if (!firstDigit) {
        System.out.print(", ");
      } else {
        firstDigit = false;
      }
            
      System.out.print(p);
    }
  }
}