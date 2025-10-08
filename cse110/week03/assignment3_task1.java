import java.util.Scanner;

public class Task1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n");
    int num = sc.nextInt();
    
    for(int i = 1; i <= num; i++) {
      if (i % 5 == 0 && i % 3 != 0) {
        System.out.println(i);
      }
    }
  }
}