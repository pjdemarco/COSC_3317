import java.util.Scanner;

public class Integer_Power {

    public static void main(String[] args) {
        Integer_Power ip = new Integer_Power();
        Scanner scanner = new Scanner(System.in);

        int base;
        int exponent;

        System.out.println("Calculate integer power.");

        System.out.println("Enter an integer value for the base.");
        base = scanner.nextInt();

        System.out.println("Enter and integer value for the exponent.");
        exponent = scanner.nextInt();

        System.out.println("The result is: " + ip.integerPower(base, exponent));
    }

    public double integerPower(int base, int exponent) {
        int total = base;
        while (exponent > 1) {
            total *= base;
            exponent--;
        }
        return total;
    }
}
