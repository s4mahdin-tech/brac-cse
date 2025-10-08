import java.util.Scanner;

public class Task4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Number of Customers: ");
    int n = sc.nextInt();

    for (int customer = 1; customer <= n; customer++) {
        System.out.print("Item Number for Customer-" + customer + ": ");
        int k = sc.nextInt();            
        double totalPrice = 0; 

        for (int item = 1; item <= k; item++) {
            System.out.print("Item-" + item + ": ");
            double price = sc.nextDouble(); 
            totalPrice += price;
        }

        double averagePrice = totalPrice / k;
        System.out.printf("Average for Customer-%d: %.1f%n", customer, averagePrice);
    }       
  }
}