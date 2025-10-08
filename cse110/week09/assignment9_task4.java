public class Task4 {
  public static int fibonacci(int a) {
    if (a == 0) {
      return 0;
    }
    else if (a == 1) {
      return 1;
    }
    return fibonacci(a - 1) + fibonacci(a - 2); 
  }

  public static void main(String[] args) {
    System.out.println(fibonacci(0));
    System.out.println(fibonacci(1));
    System.out.println(fibonacci(5));
    System.out.println(fibonacci(9));
  }  
}