import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int X = sc.nextInt(); 
            int Y = sc.nextInt(); 
            
            int sum = 0;
            int count = 0;
            int currentNumber = X;

            while (count < Y) {           
                if (currentNumber % 2 != 0) {
                    sum += currentNumber; 
                    count++; 
                }
                currentNumber++; 
            }            
            System.out.println(sum);
        }
    }
}