public class VariableExamples {
    public static void main(String[] args) {
        // Primitive data types
        int age = 25;
        System.out.println("Age: " + age + " (int)");

        double salary = 5000.50;
        System.out.println("Salary: " + salary + " (double)");

        char grade = 'A';
        System.out.println("Grade: " + grade + " (char)");

        boolean isEmployed = true;
        System.out.println("Employed: " + isEmployed + " (boolean)");

        byte byteValue = 127;
        System.out.println("Byte Value: " + byteValue + " (byte)");

        short shortValue = 30000;
        System.out.println("Short Value: " + shortValue + " (short)");

        long longValue = 1000000000L;
        System.out.println("Long Value: " + longValue + " (long)");

        float floatValue = 3.14f;
        System.out.println("Float Value: " + floatValue + " (float)");

        // Reference data types (Objects)
        String name = "John Doe";
        System.out.println("Name: " + name + " (String)");

        Integer count = 10;
        System.out.println("Count: " + count + " (Integer)");

        Double weight = 65.5;
        System.out.println("Weight: " + weight + " (Double)");

        Character symbol = '#';
        System.out.println("Symbol: " + symbol + " (Character)");

        Boolean isActive = false;
        System.out.println("Active: " + isActive + " (Boolean)");

        // Array
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Numbers: " + java.util.Arrays.toString(numbers) + " (int[])");

        String[] fruits = {"Apple", "Banana", "Orange"};
        System.out.println("Fruits: " + java.util.Arrays.toString(fruits) + " (String[])");

        // Constants
        final int MAX_VALUE = 100;
        System.out.println("Max Value: " + MAX_VALUE + " (final int)");
    }
}
