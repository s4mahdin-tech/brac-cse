import java.util.Scanner;

public class Task3 {
  
  public static double calcTax(double a, double s) {
    if (a < 18 || s < 10000) {
      return 0.0;
    }
    else if (s > 10000 && s <= 20000) {
      return s * 0.07; 
    }
    else { 
      return s * 0.14; 
    }
  }
  
  public static void calcYearlyTax() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter age");
    double a = sc.nextDouble();
    
    double totalTax = 0.0;
    for (int i = 1; i <= 12; i++) {
      double s = sc.nextDouble();  
      double tax = calcTax(a, s); 
      totalTax += tax;

      System.out.printf("Month%d tax: %.1f%n", i, tax);
    }

    System.out.printf("Total Yearly Tax: %.1f%n", totalTax);
  }
   
  public static void main(String[] args) {
    double t1 = calcTax(16, 20000);
    System.out.println(t1);

    double t2 = calcTax(20, 18000);
    System.out.printf("%.1f%n", t2);
    
    calcYearlyTax();
  }
}