import java.util.Scanner;

public class Calculate_Earnings {

    public static void main(String[] args) {
        int qtyItem1;
        int qtyItem2;
        int qtyItem3;
        int qtyItem4;
        double earnings;
        Calculate_Earnings calc = new Calculate_Earnings();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculate Weekly Earnings:");

        System.out.println("Enter the quantity sold for Item 1.");
        qtyItem1 = scanner.nextInt();

        System.out.println("Enter the quantity sold for Item 2.");
        qtyItem2 = scanner.nextInt();

        System.out.println("Enter the quantity sold for Item 3.");
        qtyItem3 = scanner.nextInt();

        System.out.println("Enter the quantity sold for Item 4.");
        qtyItem4 = scanner.nextInt();

        earnings = calc.calculateEarnings(calc.calculateGrossSales(qtyItem1, qtyItem2, qtyItem3, qtyItem4));
        System.out.println("The weekly earnings for this employee is $" + earnings);


    }

    public double calculateGrossSales(int qtyItem1, int qtyItem2, int qtyItem3, int qtyItem4) {
        double grossSales = 0;
        grossSales += qtyItem1 * 239.99;
        grossSales += qtyItem2 * 129.75;
        grossSales += qtyItem3 * 99.95;
        grossSales += qtyItem4 * 350.89;
        return grossSales;
    }

    public double calculateEarnings(double grossSales) {
        double earnings = 200 + (grossSales * .09);
        return earnings;
    }
}
