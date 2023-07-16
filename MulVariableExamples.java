public class MulVariableExamples {
    public static void main(String[] args) {
        // Primitive data types
        int age1 = 25, age2 = 30;
        System.out.println("Age 1: " + age1 + " (int)");
        System.out.println("Age 2: " + age2 + " (int)");

        double salary1 = 5000.50, salary2 = 6000.75;
        System.out.println("Salary 1: " + salary1 + " (double)");
        System.out.println("Salary 2: " + salary2 + " (double)");

        char grade1 = 'A', grade2 = 'B';
        System.out.println("Grade 1: " + grade1 + " (char)");
        System.out.println("Grade 2: " + grade2 + " (char)");

        boolean isEmployed1 = true, isEmployed2 = false;
        System.out.println("Employed 1: " + isEmployed1 + " (boolean)");
        System.out.println("Employed 2: " + isEmployed2 + " (boolean)");

        byte byteValue1 = 127, byteValue2 = -128;
        System.out.println("Byte Value 1: " + byteValue1 + " (byte)");
        System.out.println("Byte Value 2: " + byteValue2 + " (byte)");

        short shortValue1 = 30000, shortValue2 = -30000;
        System.out.println("Short Value 1: " + shortValue1 + " (short)");
        System.out.println("Short Value 2: " + shortValue2 + " (short)");

        long longValue1 = 1000000000L, longValue2 = -1000000000L;
        System.out.println("Long Value 1: " + longValue1 + " (long)");
        System.out.println("Long Value 2: " + longValue2 + " (long)");

        float floatValue1 = 3.14f, floatValue2 = -2.5f;
        System.out.println("Float Value 1: " + floatValue1 + " (float)");
        System.out.println("Float Value 2: " + floatValue2 + " (float)");

        // Reference data types (Objects)
        String name1 = "John Doe", name2 = "Jane Smith";
        System.out.println("Name 1: " + name1 + " (String)");
        System.out.println("Name 2: " + name2 + " (String)");

        Integer count1 = 10, count2 = 15;
        System.out.println("Count 1: " + count1 + " (Integer)");
        System.out.println("Count 2: " + count2 + " (Integer)");

        Double weight1 = 65.5, weight2 = 70.2;
        System.out.println("Weight 1: " + weight1 + " (Double)");
        System.out.println("Weight 2: " + weight2 + " (Double)");

        Character symbol1 = '#', symbol2 = '@';
        System.out.println("Symbol 1: " + symbol1 + " (Character)");
        System.out.println("Symbol 2: " + symbol2 + " (Character)");

        Boolean isActive1 = true, isActive2 = false;
        System.out.println("Active 1: " + isActive1 + " (Boolean)");
        System.out.println("Active 2: " + isActive2 + " (Boolean)");

        // Array
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Numbers: " + java.util.Arrays.toString(numbers) + " (int[])");

        String[] fruits = {"Apple", "Banana", "Orange"};
        System.out.println("Fruits: " + java.util.Arrays.toString(fruits) + " (String[])");

        // Constants
        final int MAX_VALUE = 100;
        final int MIN_VALUE = 0;
        System.out.println("Max Value: " + MAX_VALUE + " (final int)");
        System.out.println("Min Value: " + MIN_VALUE + " (final int)");
    }
}
