import java.util.Scanner;

public class Ex2_32 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[5];
        int pos = 0;
        int neg = 0;
        int zero = 0;


        System.out.println("Enter the first number:");
        numbers[0] = scanner.nextInt();
        System.out.println("Enter the second number:");
        numbers[1] = scanner.nextInt();
        System.out.println("Enter the third number:");
        numbers[2] = scanner.nextInt();
        System.out.println("Enter the fourth number:");
        numbers[3] = scanner.nextInt();
        System.out.println("Enter the fifth number:");
        numbers[4] = scanner.nextInt();

        for (int num: numbers) {
            if (num  == 0) {
                zero++;
            } else if (num < 0) {
                neg++;
            } else {
                pos++;
            }
        }

        System.out.printf("For the given input, there are %d zeros, %d positive integer(s), and %d negative integer(s).", zero, pos, neg);
    }
}
