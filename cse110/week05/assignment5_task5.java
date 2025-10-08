import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int k = n - i; k > 0; k--) {
                System.out.print(" ");      
            }
            for (int j = 1; j <= i; j++) {                         
                System.out.print(j);
            }
            for (int f = i - 1; f > 0; f--) {
                System.out.print(f);
            }
            System.out.println();
        }
    }
}