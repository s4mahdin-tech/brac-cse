import java.util.Scanner;

public class Task2 {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String s1 = sc.next();
     String s2 = sc.next();
     String result = "";

     for (int i = 0; i < s1.length(); i++) {
         char c = s1.charAt(i);
         boolean found = false;

         for (int j = 0; j < s2.length(); j++) {
             if (c == s2.charAt(j)) {
                 found = true;
                 break;
             }
         }            
         if (!found) {
             result += c;
         }
     }
        
     for (int i = 0; i < s2.length(); i++) {
         char c = s2.charAt(i);
         boolean found = false;

         for (int j = 0; j < s1.length(); j++) {
             if (c == s1.charAt(j)) {
                 found = true;
                 break;
             }
         }
            
         if (!found) {
             result += c;
         }
     }

     String uppercaseResult = "";
     for (int i = 0; i < result.length(); i++) {
         char c = result.charAt(i);
         if (c >= 'a' && c <= 'z') {
             uppercaseResult += (char)(c - 32);
         } else {
             uppercaseResult += c;
         }
     }        
     System.out.println(uppercaseResult);
  }
}