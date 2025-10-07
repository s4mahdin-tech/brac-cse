public class Task5 {
  public static void main(String[] args) {
    double a = 4.5d;
    double b = 9.5d;
    double c = Math.sqrt(a * a + b * b);
    
    double sinA = a / c;
    double cosA = b / c;
    double sinB = b / c;
    double cosB = a / c;
    
    System.out.println("sin(A): " + sinA);
    System.out.println("cos(A): " + cosA);
    System.out.println("sin(b): " + sinB);
    System.out.println("cos(B): " + cosB);
  }
}