import java.util.Scanner;

public class Task3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number");
    int num = sc.nextInt();
    int p1 = 0;
    int p2 = 0; 
    
    for(int i = 1; i <= num; i++) {
      System.out.println("Enter number " + i);
      int xoxo = sc.nextInt();     
      System.out.println(xoxo);
      
      if (xoxo >= 0) { 
        p1++;
      }
      else if (xoxo < 0) {
        p2++;
      }
    }
    
    System.out.println(p1 + " Non-negative Numbers");
    System.out.println(p2 + " Negative Numbers");
  }
}