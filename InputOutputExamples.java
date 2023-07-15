import java.util.Scanner;

public class InputOutputExamples {
    public static void main(String[] args) {
        // Output statements
        System.out.println("Output statement: Hello, World!");

        int number = 10;
        System.out.println("Output statement: The number is " + number);

        double price = 19.99;
        System.out.printf("Output statement: The price is %.2f%n", price);

        // Input statements
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input statement: Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Input statement: Your name is " + name);

        System.out.print("Input statement: Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Input statement: Your age is " + age);

        System.out.print("Input statement: Enter a decimal number: ");
        double decimal = scanner.nextDouble();
        System.out.println("Input statement: The decimal number is " + decimal);

        scanner.close();
    }
}
