import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW10 {

    public static void main(String[] args) throws FileNotFoundException {
        int[] nums = new int[100];
        Random rand = new Random();

        PrintWriter writer = new PrintWriter(new File("C:\\Users\\demar\\Desktop\\School Stuff\\2020-2021\\Spring 2021\\COSC 3317 - Object Oriented Programming\\Homework\\Homework 10\\HW10Input.txt"));

        Scanner scanner = new Scanner(new File("C:\\Users\\demar\\Desktop\\School Stuff\\2020-2021\\Spring 2021\\COSC 3317 - Object Oriented Programming\\Homework\\Homework 10\\HW10Input.txt"));

        PrintWriter writer2 = new PrintWriter(new File("C:\\Users\\demar\\Desktop\\School Stuff\\2020-2021\\Spring 2021\\COSC 3317 - Object Oriented Programming\\Homework\\Homework 10\\HW10Output.txt"));

        for(int i = 0; i < nums.length; i++) {
            writer.print(rand.nextInt(1001) + " ");
        }
        writer.close();

        for(int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        scanner.close();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            writer2.print(nums[i] + " ");
        }
        writer2.close();
    }
}