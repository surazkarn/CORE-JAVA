import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print("enter the value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 1;

        while (counter <= n + 1) {
            System.out.println(a);

            int sum = a + b;
            a = b;
            b = sum;
            counter++;
        }
    }
}
