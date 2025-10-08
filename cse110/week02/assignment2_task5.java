import java.util.Scanner;

public class Task5 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the amount the customer need to pay");
    int num1 = sc.nextInt();
    System.out.println("Enter the amount, customer gave");
    int num2 = sc.nextInt();
    
    if (num2 > num1) {
      int change = num2 - num1;
      System.out.println("the returned amount is " + change + " taka");
      
      int hundredNotes = change / 100;
      int remaining = change % 100;
      
      int fiftyNotes = remaining / 50;
      remaining %= 50;
      
      int twentyNotes = remaining / 20;
      remaining %= 20;
      
      int tenNotes = remaining / 10;
      remaining %= 10;
      
      int fiveCoins = remaining / 5;
      remaining %= 5;
      
      int twoCoins = remaining / 2;
      remaining %= 2;
      
      int oneCoins = remaining;
      
      System.out.println("100 taka note: " + hundredNotes);
      System.out.println("50 taka note: " + fiftyNotes);
      System.out.println("20 taka note: " + twentyNotes);
      System.out.println("10 taka note: " + tenNotes);
      System.out.println("5 taka coin: " + fiveCoins);
      System.out.println("2 taka coin: " + twoCoins);
      System.out.println("1 taka coin: " + oneCoins);
    }
    else if (num2 < num1) {
      int remaining = num1 - num2;
      System.out.println("Please pay " + remaining + " taka more.");
    }
    else {
      System.out.println("The returned amount is 0.");
    }
  }
}