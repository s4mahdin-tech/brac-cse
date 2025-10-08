public class Task1 {
  public static int factorial(int N) {
    if (N == 0) {
      return 1; 
    }
    return N * factorial(N - 1);
  }
  
  public static void main(String[] args) {
    int x1 = factorial(5);
    System.out.println(x1);
    int x2 = factorial(7);
    System.out.println(x2);
  }
}