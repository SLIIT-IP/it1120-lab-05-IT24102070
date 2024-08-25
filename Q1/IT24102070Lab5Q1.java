import java.util.Scanner;

public class IT24102070Lab5Q1 {
    public static void main(String args[]) {
        int num1, num2, num3;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter First integer: ");
        num1 = input.nextInt();
        System.out.println("Enter Second integer: ");
        num2 = input.nextInt();
        System.out.println("Enter Third integer: ");
        num3 = input.nextInt();
        int min = num1;
        int max = num1;

        if (num2 < min) {
            min = num2;
        }
        if (num2 > max) {
            max = num2;
        }
        if (num3 < min) {
            min = num3;
        }
        if (num3 > max) {
            max = num3;
        }

        System.out.println("The smallest number is: " + min);
        System.out.println("The largest number is: " + max);
    }
}
