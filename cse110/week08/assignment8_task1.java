import java.util.Scanner;

public class Task1 {
  public static boolean isPrime(int a) {
    int count = 0;
    for (int i = 1; i <= a; i++) {
      if (a % i == 0) {
        count++;
      }
    }
    if (count == 2) {
      return true;
    }
    else {      
      return false;
    }
  }
  
  public static boolean isPerfect(int a) {
    int sum = 0;
    for (int i = 1; i < a; i++) {
      if (a % i == 0) {
        sum += i;
      }
    }
    if (sum == a) {
      return true;
    }
    else {
      return false;
    }
  }
  
  public static int special_sum(int user) {
    int sum1 = 0;
    for (int i = 1; i < user; i++) {
      if (isPrime(i) || isPerfect(i) && !(isPrime(i) && isPerfect(i))) {
        sum1 += i;
      }
    }
    return sum1;
  }
    
  public static void main(String[] args) {
    boolean check1 = isPrime(7);
    System.out.println(check1);
    boolean check2 = isPrime(15);
    System.out.println(check2);
    
    boolean check3 = isPerfect(6);
    System.out.println(check3);
    boolean check4 = isPerfect(33);
    System.out.println(check4);
    
    Scanner sc = new Scanner(System.in);    
    int result = special_sum(sc.nextInt());
    System.out.println(result);
  } 
}