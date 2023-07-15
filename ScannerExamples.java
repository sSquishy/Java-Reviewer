import java.util.Scanner;

public class ScannerExamples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // String input
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.println("You entered: " + str);

        // Integer input
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        System.out.println("You entered: " + num);

        // Double input
        System.out.print("Enter a double: ");
        double decimal = scanner.nextDouble();
        System.out.println("You entered: " + decimal);

        // Boolean input
        System.out.print("Enter a boolean (true/false): ");
        boolean bool = scanner.nextBoolean();
        System.out.println("You entered: " + bool);

        // Character input
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        System.out.println("You entered: " + ch);

        scanner.close();
    }
}
