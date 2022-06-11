import java.util.Scanner;

public class SumOfNNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int counter = 1;
        int sum = 0;
        while (counter <= n) {
            sum = sum + counter;
            counter = counter + 1;
        }
        System.out.println(n);
        System.out.println(sum);
        System.out.println(counter);

    }
}
