import java.util.Scanner;

public class Task5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int num = sc.nextInt();
    int sum = 0;
    
    for(int i = 1; i <= num; i++) {     
      System.out.println("Enter number");
      int XD = sc.nextInt();
      sum = sum + XD;
      System.out.println("sum= " + sum);
    }
  }
}