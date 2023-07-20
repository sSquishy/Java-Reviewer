public class TernaryOperatorExample {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        // Using ternary operator to find the maximum value
        int max = (num1 > num2) ? num1 : num2;

        // Using ternary operator to check if a number is even or odd
        int number = 25;
        String isEven = (number % 2 == 0) ? "even" : "odd";

        System.out.println("The maximum value is: " + max);
        System.out.println(number + " is " + isEven);
    }
}
