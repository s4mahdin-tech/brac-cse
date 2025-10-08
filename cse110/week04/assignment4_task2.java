import java.util.Scanner;

public class Task2 {
  public static void main(String[] args) {
    
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the length");        
     int length = sc.nextInt();
     System.out.println("Enter the width");
     int width = sc.nextInt();
        
     for (int i = 0; i < width; i++) {      
         for (int j = 1; j <= length; j++) { 
             System.out.print(j);
             if (j < length) {
                 System.out.print(" "); 
             }
         }
         System.out.println(); 
    }
  }
}