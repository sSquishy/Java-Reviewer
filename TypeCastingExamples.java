public class TypeCastingExamples {
    public static void main(String[] args) {
        // Implicit casting (Widening)
        int intValue = 10;
        double doubleValue = intValue;
        System.out.println(intValue + " (int) implicitly casted to " + doubleValue + " (double)");

        char charValue = 'A';
        int intValue2 = charValue;
        System.out.println(charValue + " (char) implicitly casted to " + intValue2 + " (int)");

        // Explicit casting (Narrowing)
        double doubleValue2 = 20.5;
        int intValue3 = (int) doubleValue2;
        System.out.println(doubleValue2 + " (double) explicitly casted to " + intValue3 + " (int)");

        long longValue = 100L;
        int intValue4 = (int) longValue;
        System.out.println(longValue + " (long) explicitly casted to " + intValue4 + " (int)");

        // Numeric promotion
        int x = 10;
        long y = 5L;
        double result = x + y;
        System.out.println("Numeric promotion: " + x + " (int) + " + y + " (long) = " + result + " (double)");

        // String to numeric conversion
        String numericString = "25";
        int numericValue = Integer.parseInt(numericString);
        System.out.println(numericString + " (String) converted to " + numericValue + " (int)");

        String doubleString = "3.14";
        double doubleNumber = Double.parseDouble(doubleString);
        System.out.println(doubleString + " (String) converted to " + doubleNumber + " (double)");

        // Numeric to String conversion
        int number = 100;
        String numberString = String.valueOf(number);
        System.out.println(number + " (int) converted to " + numberString + " (String)");

        double decimalNumber = 3.5;
        String decimalString = String.valueOf(decimalNumber);
        System.out.println(decimalNumber + " (double) converted to " + decimalString + " (String)");

        // Character to String conversion
        char character = 'X';
        String characterString = String.valueOf(character);
        System.out.println(character + " (char) converted to " + characterString + " (String)");
    }
}
