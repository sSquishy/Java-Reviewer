public class SwitchCaseExample {
    public static void main(String[] args) {
        // Example 1: Switch with Integer
        int dayOfWeek = 3;
        String dayName;

        switch (dayOfWeek) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }
        System.out.println("Today is " + dayName);

        // Example 2: Switch with Character
        char grade = 'B';
        String message;

        switch (grade) {
            case 'A':
                message = "Excellent!";
                break;
            case 'B':
                message = "Good job!";
                break;
            case 'C':
                message = "Passing grade";
                break;
            case 'D':
            case 'E':
                message = "Needs improvement";
                break;
            default:
                message = "Try again next time";
                break;
        }
        System.out.println("Grade: " + grade + ", " + message);

        // Example 3: Switch with String (Java 7 and above)
        String fruit = "apple";
        String color;

        switch (fruit) {
            case "apple":
                color = "red";
                break;
            case "banana":
                color = "yellow";
                break;
            case "orange":
                color = "orange";
                break;
            default:
                color = "unknown";
                break;
        }
        System.out.println("Fruit: " + fruit + ", Color: " + color);
    }
}
