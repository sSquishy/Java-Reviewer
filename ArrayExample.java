import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5};

        // Example 1: Creating and Initializing an Array
        System.out.println("Example 1: Creating and Initializing an Array");
        System.out.println("Before: " + Arrays.toString(numbers));
        System.out.println("Numbers array: " + Arrays.toString(numbers));
        System.out.println("-------------------------");

        // Example 2: Accessing Array Elements
        System.out.println("Example 2: Accessing Array Elements");
        System.out.println("Before: " + Arrays.toString(numbers));
        System.out.println("Second element: " + numbers[1]);
        System.out.println("-------------------------");

        // Example 3: Modifying Array Elements
        System.out.println("Example 3: Modifying Array Elements");
        System.out.println("Before: " + Arrays.toString(numbers));
        numbers[3] = 7;
        System.out.println("Numbers array after modification: " + Arrays.toString(numbers));
        System.out.println("-------------------------");

        // Example 4: Array Length
        System.out.println("Example 4: Array Length");
        System.out.println("Before: " + Arrays.toString(numbers));
        System.out.println("Length of numbers array: " + numbers.length);
        System.out.println("-------------------------");

        // Example 5: Looping through an Array
        System.out.println("Example 5: Looping through an Array");
        System.out.println("Before: " + Arrays.toString(numbers));
        System.out.println("Numbers array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
        System.out.println("-------------------------");

        // Example 6: Enhanced For Loop (For-each Loop)
        System.out.println("Example 6: Enhanced For Loop (For-each Loop)");
        System.out.println("Before: " + Arrays.toString(numbers));
        System.out.println("Numbers array elements using enhanced for loop:");
        for (int num : numbers) {
            System.out.println("Element: " + num);
        }
    }
}
