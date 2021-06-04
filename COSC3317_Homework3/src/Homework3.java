import java.util.Scanner;

public class Homework3 {
    Scanner scanner = new Scanner(System.in);
    int[] salaries = new int[9];
    int qtyItem1;
    int qtyItem2;
    int qtyItem3;
    int qtyItem4;
    int earnings;
    int grossSales;

    public static void main(String[] args) {
        Homework3 hw3 = new Homework3();
        hw3.run();
    }

    public void run() {
        System.out.println("Calculate Weekly Earnings:");

        System.out.println("Enter the quantity sold for Item 1. (Must be greater than or equal to 0)");
        qtyItem1 = acceptInput();

        System.out.println("Enter the quantity sold for Item 2. (Must be greater than or equal to 0)");
        qtyItem2 = acceptInput();

        System.out.println("Enter the quantity sold for Item 3. (Must be greater than or equal to 0)");
        qtyItem3 = acceptInput();

        System.out.println("Enter the quantity sold for Item 4. (Must be greater than or equal to 0)");
        qtyItem4 = acceptInput();

        grossSales = calculateGrossSales(qtyItem1, qtyItem2, qtyItem3, qtyItem4);
        earnings = calculateEarnings(grossSales);

        if (earnings >= 200 && earnings <= 299) {
            salaries[0]++;
            newOrTally();
        } else if (earnings >= 300 && earnings <= 399) {
            salaries[1]++;
            newOrTally();
        } else if (earnings >= 400 && earnings <= 499) {
            salaries[2]++;
            newOrTally();
        } else if (earnings >= 500 && earnings <= 599) {
            salaries[3]++;
            newOrTally();
        } else if (earnings >= 600 && earnings <= 699) {
            salaries[4]++;
            newOrTally();
        } else if (earnings >= 700 && earnings <= 799) {
            salaries[5]++;
            newOrTally();
        } else if (earnings >= 800 && earnings <= 899) {
            salaries[6]++;
            newOrTally();
        } else if (earnings >= 900 && earnings <= 999) {
            salaries[7]++;
            newOrTally();
        } else if (earnings >= 1000) {
            salaries[8]++;
            newOrTally();
        }
    }

    public int acceptInput() {
        int input = scanner.nextInt();
        if (input < 0) {
            System.out.println("Invalid input...");
            System.out.println("Enter a value greater than or equal to 0.");
            acceptInput();
        } else {
            return input;
        }
        return -1;
    }

    public int calculateGrossSales(int qtyItem1, int qtyItem2, int qtyItem3, int qtyItem4) {
        int grossSales = 0;
        grossSales += qtyItem1 * 239.99;
        grossSales += qtyItem2 * 129.75;
        grossSales += qtyItem3 * 99.95;
        grossSales += qtyItem4 * 350.89;
        return grossSales;
    }

    public int calculateEarnings(int grossSales) {
        return (int) (200 + (grossSales * .09));
    }

    public void newOrTally() {
        System.out.println("Press 1 to enter another employee, or press 2 to tally results:");
        int choice = scanner.nextInt();
        if (choice == 1) {
            run();
        } else if (choice == 2) {
            tally(salaries);
        } else {
            System.out.println("Invalid Input...");
            newOrTally();
        }
    }

    public void tally(int[] salaries) {
        System.out.println("Salary Distribution:");
        int count  = 0;
        while (count < salaries.length) {
            for (int counter = 200; counter < 1001; counter+=100) {
                if (counter == 1000) {
                    System.out.printf("$" + "%7d+: " + salaries[count], 1000);
                    count++;
                } else {
                    System.out.printf("$" + "%d-" + "$" + "%d: " + salaries[count], counter, counter+99);
                    count++;
                }
                System.out.println();
            }
        }

    }
}
