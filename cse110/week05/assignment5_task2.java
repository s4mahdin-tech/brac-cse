import java.util.Scanner;

public class Task2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int temp = n;
    
    for (int i = 1; i <= n; i++) { 
      for (int j = 1; j <= n; j++) {
        if (i == n) {
          System.out.print(j);
          continue;
        }
        
        if (j == n || j == temp) {
          System.out.print(j);
        }
        else {
          System.out.print(" ");
        }
      }
      temp--;
      System.out.println();
    }
  }
}