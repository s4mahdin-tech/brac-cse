import java.util.Scanner;

public class Task4 {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String password = sc.nextLine();
        
     boolean hasUpperC = false;
     boolean hasLowerC = false;
     boolean hasDigitC = false;
     boolean hasSpecialC = false;

     if (password.length() < 8) {
         System.out.println("False");
     }
     else {
         for (int i = 0; i < password.length(); i++) {
             char c = password.charAt(i);
             if (c >= 'A' && c <= 'Z') {
                 hasUpperC = true;
             }
             else if (c >= 'a' && c <= 'z') {
                 hasLowerC = true;
             }
             else if (c >= '0' && c <= '9') {
                 hasDigitC = true;
             }
             else if (c != ' ') {
                 hasSpecialC = true;
             }
         }

         if (hasUpperC && hasLowerC && hasDigitC && hasSpecialC) {
             System.out.println("True");
         } else {
             System.out.println("False");
         }
     }
  }
}