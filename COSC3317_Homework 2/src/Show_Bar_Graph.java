import java.util.Scanner;

public class Show_Bar_Graph {

    public static void main(String[] args) {
        Show_Bar_Graph bg = new Show_Bar_Graph();
        Scanner scanner = new Scanner(System.in);

        int value1;
        int value2;
        int value3;
        int value4;
        int value5;

        String result1;
        String result2;
        String result3;
        String result4;
        String result5;

        System.out.println("Display bar graph.");

        System.out.println("Enter an integer between 1 and 30 for value 1.");
        value1 = scanner.nextInt();

        System.out.println("Enter an integer between 1 and 30 for value 2.");
        value2 = scanner.nextInt();

        System.out.println("Enter an integer between 1 and 30 for value 3.");
        value3 = scanner.nextInt();

        System.out.println("Enter an integer between 1 and 30 for value 4.");
        value4 = scanner.nextInt();

        System.out.println("Enter an integer between 1 and 30 for value 5.");
        value5 = scanner.nextInt();

        result1 = bg.barGraph(value1);
        result2 = bg.barGraph(value2);
        result3 = bg.barGraph(value3);
        result4 = bg.barGraph(value4);
        result5 = bg.barGraph(value5);

        System.out.println("Results: ");
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

    }

    public String barGraph(int num) {
        String result = "";
        while (num > 0) {
            result += "*";
            num --;
        }
        return result;
    }
}
