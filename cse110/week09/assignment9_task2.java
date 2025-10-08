public class Task2 {
  public static int power(int a, int b) {
    if (b == 0) {
      return 1;
    }
    return a * power(a, b - 1);
  }

  public static void main(String[] args) {
    int x1 = power(5, 3);
    System.out.println(x1);
    int x2 = power(8, 4);
    System.out.println(x2);
  }
}