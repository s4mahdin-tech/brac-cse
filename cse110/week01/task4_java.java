public class Task4 {
  public static void main(String[] args) {
    int a = 8;
    int b = 3;
    double side = Math.sqrt((a / 2) * (a / 2) + b * b);
    
    double circumference = side * 6;
    double area = ((3 * Math.sqrt(3)) / 2) * side * side;
    
    System.out.println("Area: " + area + " " + " Circumference: " + circumference);
  }
}