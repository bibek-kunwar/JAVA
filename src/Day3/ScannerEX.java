package Day3;

import java.util.Scanner;

public class ScannerEX {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in); // Input stream is used

        System.out.print("Enter any name: ");
        String name = read.next();

        System.out.print("Enter your age in years: ");
        int age = read.nextInt();

        System.out.print("Enter your salary: ");
        double salary = read.nextDouble();

        System.out.print("Enter any message: ");
        read = new Scanner(System.in);
        String msg = read.nextLine();

        System.out.println("\n------------------------------------------");
        System.out.println("Hello, " + name);
        System.out.println("You are " + age + " years old.");
        System.out.println("You are earning Rs." + salary + " per month.");
        System.out.println("Words from " + name + " - " + msg);
    }
}
