import java.util.Scanner;

public class Ex2_26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int first;
        int second;

        System.out.println("Enter the first number: ");
        first = scanner.nextInt();

        System.out.println("Enter the second number: ");
        second = scanner.nextInt();

        if (first % second == 0) {
            System.out.printf("\n%d is a multiple of %d.", first, second);
        } else {
            System.out.printf("\n%d is not a multiple of %d.", first, second);
        }
    }
}
