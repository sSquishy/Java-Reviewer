import java.util.Arrays;
public class ArrayExample {
    public static void main(String[] args) {
        // Example 1: Creating and Initializing an Array
        int[] numbers = {5, 2, 9, 1, 5};
        System.out.println("Example 1: Creating and Initializing an Array");
        System.out.println("Numbers array: " + Arrays.toString(numbers));
        System.out.println("-------------------------");

        // Example 2: Accessing Array Elements
        System.out.println("Example 2: Accessing Array Elements");
        System.out.println("Second element: " + numbers[1]);
        System.out.println("-------------------------");

        // Example 3: Modifying Array Elements
        numbers[3] = 7;
        System.out.println("Example 3: Modifying Array Elements");
        System.out.println("Numbers array after modification: " + Arrays.toString(numbers));
        System.out.println("-------------------------");

        // Example 4: Array Length
        System.out.println("Example 4: Array Length");
        System.out.println("Length of numbers array: " + numbers.length);
        System.out.println("-------------------------");
    }
}
