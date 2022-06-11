import java.util.Scanner;

public class PrimeNumFlagWhileIfElse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;
        int div = 2;

        while (div <= n - 1) {
            if (n % div == 0) {
                flag = false;
            }

            div = div + 1;
        }
        if (flag == true) {
            System.out.println("prime");
            System.out.println(flag);

        } else {
            System.out.println("not prime");
            System.out.println(flag);

        }
    }
}
