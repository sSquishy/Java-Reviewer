public class ConditionalStatementsExamples {
    public static void main(String[] args) {
        int num = 10;
        
        // if statement
        if (num > 0) {
            System.out.println("Number is positive.");
        }
        
        int anotherNum = -5;
        
        // if-else statement
        if (anotherNum > 0) {
            System.out.println("Number is positive.");
        } else {
            System.out.println("Number is non-positive.");
        }
        
        int thirdNum = 0;
        
        // nested if statement
        if (thirdNum > 0) {
            System.out.println("Number is positive.");
        } else if (thirdNum < 0) {
            System.out.println("Number is negative.");
        } else {
            System.out.println("Number is zero.");
        }
        
        int day = 3;
        String dayName;
        
        // switch statement
        switch (day) {
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
        }
        System.out.println("Day of the week is: " + dayName);
        
        int checkNum = 7;
        
        // ternary operator
        String result = (checkNum % 2 == 0) ? "Even" : "Odd";
        System.out.println(checkNum + " is " + result);
    }
}
