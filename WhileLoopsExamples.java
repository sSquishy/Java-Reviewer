import java.util.Scanner;

public class WhileLoopsExamples {
    public static void mainn(String[] args){
        Scanner scanner = new Scanner(System.in);

        // While loop
        int count = 1;
        while (count <= 5) {
            System.out.println("While loop iteration " + count);
            count++;
        }

        System.out.println("---------------------------------");
        
        // While loop with user input
        int sum = 0;
        int number;
        System.out.println("Enter numbers to find their sum (enter 0 to stop): ");
        while (true) {
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            sum += number;
        }
        System.out.println("Sum: " + sum);

        System.out.println("---------------------------------");

        int i = 1;
        do {
            System.out.println("Do-While loop iteration " + i);
            i++;
        } while (i <= 5);
    }

}
