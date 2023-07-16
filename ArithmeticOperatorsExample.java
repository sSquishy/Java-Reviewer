public class ArithmeticOperatorsExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Addition
        int sum = a + b;
        System.out.println(a + " + " + b + " = " + sum);

        // Subtraction
        int difference = a - b;
        System.out.println(a + " - " + b + " = " + difference);

        // Multiplication
        int product = a * b;
        System.out.println(a + " * " + b + " = " + product);

        // Division
        int quotient = a / b;
        System.out.println(a + " / " + b + " = " + quotient);

        // Modulus
        int remainder = a % b;
        System.out.println(a + " % " + b + " = " + remainder);

        // Increment
        int increment = a++;
        System.out.println("Increment of " + a + " is " + increment);

        // Decrement
        int decrement = b--;
        System.out.println("Decrement of " + b + " is " + decrement);

        // Compound assignment
        int c = 5;
        c += 3; // Equivalent to c = c + 3;
        System.out.println("c += 3: " + c);

        c -= 2; // Equivalent to c = c - 2;
        System.out.println("c -= 2: " + c);

        c *= 4; // Equivalent to c = c * 4;
        System.out.println("c *= 4: " + c);

        c /= 2; // Equivalent to c = c / 2;
        System.out.println("c /= 2: " + c);

        c %= 3; // Equivalent to c = c % 3;
        System.out.println("c %= 3: " + c);
    }
}
