public class MathOperationsExample {
    public static void main(String[] args) {
        // Absolute value
        int absolute = Math.abs(-10);
        System.out.println("Absolute value of -10: " + absolute);

        // Maximum value
        int max = Math.max(5, 10);
        System.out.println("Maximum value between 5 and 10: " + max);

        // Minimum value
        int min = Math.min(5, 10);
        System.out.println("Minimum value between 5 and 10: " + min);

        // Square root
        double sqrt = Math.sqrt(25);
        System.out.println("Square root of 25: " + sqrt);

        // Power
        double power = Math.pow(2, 3);
        System.out.println("2 raised to the power of 3: " + power);

        // Rounding
        double round = Math.round(3.7);
        System.out.println("Rounded value of 3.7: " + round);

        // Trigonometric functions
        double sin = Math.sin(Math.PI / 2);
        System.out.println("Sine of 90 degrees: " + sin);

        double cos = Math.cos(Math.PI);
        System.out.println("Cosine of 180 degrees: " + cos);

        double tan = Math.tan(Math.PI / 4);
        System.out.println("Tangent of 45 degrees: " + tan);

        // Random number
        double random = Math.random();
        System.out.println("Random number between 0 and 1: " + random);
    }
}
