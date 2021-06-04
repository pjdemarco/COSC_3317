import java.util.Scanner;

public class Homework9_Reverse {

    public static void main(String[] args) {
        Homework9_Reverse hw2 = new Homework9_Reverse();
        hw2.reverse();
    }

    public void reverse() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence.");
        String original = scanner.nextLine();
        String[] words = original.split(" ");
        String reversed = "";
        for (int i = words.length-1; i>=0; i--) {
            reversed += words[i] + " ";
        }
        System.out.println(reversed);
    }
}