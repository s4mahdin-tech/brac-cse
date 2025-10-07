public class Task3 {
  public static void main(String[] args) {
    int ID = 23221454;
    int a = ID % 100;
    int b = a / 10;
    int c = a % 10;
    int temp = b;
    b = c;
    c = temp;
    
    System.out.println(b + "" + c);
  }
}