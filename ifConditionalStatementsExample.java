public class ifConditionalStatementsExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int score = 85;

        // Example of the basic if statement
        if (num1 == 10) {
            System.out.println("Basic if statement: num1 is equal to 10");
        }

        // Example of the if-else statement
        if (num2 > num1) {
            System.out.println("If-else statement: num2 is greater than num1");
        } else {
            System.out.println("If-else statement: num2 is not greater than num1");
        }

        // Example of the if-else if-else statement
        if (num3 > num2) {
            System.out.println("If-else if-else statement: num3 is greater than num2");
        } else if (num3 == num2) {
            System.out.println("If-else if-else statement: num3 is equal to num2");
        } else {
            System.out.println("If-else if-else statement: num3 is less than num2");
        }

        // Example of a nested if-else statement
        if (score >= 90) {
            System.out.println("Nested if-else statement: Excellent! You got an A.");
        } else {
            if (score >= 80) {
                System.out.println("Nested if-else statement: Good job! You got a B.");
            } else {
                System.out.println("Nested if-else statement: You need to study harder.");
            }
        }
    }
}
