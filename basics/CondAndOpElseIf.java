import java.util.Scanner;

public class CondAndOpElseIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // taking input from user
        int age = sc.nextInt(); // whatever user enters i want to campture that in a variable name as 'age'

        if (age <= 11) {
            System.out.println("child");
        } else if (age >= 12 && age <= 17) {
            System.out.println("teen age");
        } else if (age >= 18 && age <= 60) {
            System.out.println("Adult");
        } else {
            System.out.println("Old");

        }

    }

}
