import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.print("Enter the size: ");
        int n = sc.nextInt();

        for (int i = 0, k = n; i < (n + 1) / 2; i++, k -= 2) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= k; j++) {
                System.out.print(j % 10);
            }            
            System.out.println();
        }

        for (int i = (n - 2) / 2, k = 3; k <= n; i--, k += 2) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= k; j++) {
                System.out.print(j % 10);
            }
            System.out.println();
        }
    }
}