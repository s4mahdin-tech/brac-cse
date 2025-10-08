import java.util.Scanner;

public class Task3 {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     String str1 = sc.nextLine();
     int count = 0;

     for(int i = 0; i <= (str1.length() - 1); i++) {
         if(i == 0) {
             if(str1.codePointAt(i) > 64 && str1.codePointAt(i) < 91) {
                 int x = str1.codePointAt(i) + 32;
                 System.out.print((char)x);
             }
             else {
               System.out.print(str1.charAt(i));
             }
         }
         else {
            if(count % 2 != 0) {
                if(str1.codePointAt(i) > 96 && str1.codePointAt(i) < 123) {
                    int y = str1.codePointAt(i) - 32;
                    System.out.print((char)y);
                }
                else {
                    System.out.print(str1.charAt(i));
                }
            }
            else {
                if(str1.codePointAt(i) > 64 && str1.codePointAt(i) < 91) {
                    int y = str1.codePointAt(i) + 32;
                    System.out.print((char)y);
                }
                else {
                    System.out.print(str1.charAt(i));
                }
            }
         }
         if((str1.codePointAt(i) >= 96 && str1.codePointAt(i) <= 123) || 
            (str1.codePointAt(i) >= 64 && str1.codePointAt(i) <= 91)) {
             count++;
         }
     }
  }
}