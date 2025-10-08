import java.util.Scanner;

public class Task5 {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String name = sc.nextLine();
     String password = sc.nextLine();        
     boolean nameFound = false;
     
     if (password.length() < name.length()) {
         System.out.println("Valid");
         return;
     }
     
     for (int i = 0; i <= password.length() - name.length(); i++) {
         boolean match = true;
         for (int j = 0; j < name.length(); j++) {
             if (password.charAt(i + j) != name.charAt(j)) {
                 match = false;
                 break;
             }
         }            
         if (match) {
             nameFound = true;
             break;
         }
     }        
     
     if (nameFound) {
         System.out.println("Invalid");
     } 
     else {
         System.out.println("Valid");
     }
  }
}