import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int k = n - i; k > 0; k--) {
                System.out.print(" ");      
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {         
                    System.out.print(j);
                } 
                else {
                    System.out.print(" ");   
                }
            }
            System.out.println();
        }
        
        for (int i = n - 1; i > 0; i--) {
            for (int k = n - i; k > 0; k--) {
                System.out.print(" ");      
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) {         
                    System.out.print(j);
                } 
                else {
                    System.out.print(" ");   
                }
            }
            System.out.println();
        }
    }
}