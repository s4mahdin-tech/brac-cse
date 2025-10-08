import java.util.Scanner;

public class Task1 {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     String text = sc.nextLine();      
     int vowelCount = 0;
     int consonantCount = 0;

     for (int i = 0; i < text.length(); i++) {
         char L = text.charAt(i);

         if ((L >= 'a' && L <= 'z') || (L >= 'A' && L <= 'Z')) {

             char lowerL;
             if (L >= 'A' && L <= 'Z') {
                 lowerL = (char)(L + 32); 
             } 
             else {
                 lowerL = L;
             }

             if (lowerL == 'a' || lowerL == 'e' || lowerL == 'i' || lowerL == 'o' || lowerL == 'u') {
                 vowelCount++;
             } 
             else {
                 consonantCount++;
             }
         }
     }

     if (vowelCount > 0 && consonantCount > 0 && 
         vowelCount % 3 == 0 && consonantCount % 5 == 0) {
         System.out.println("Aaarr! Me Plunder!!");
     }
     else {
         System.out.println("Blimey! No Plunder!!");
     }
  }
}