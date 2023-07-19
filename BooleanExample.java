public class BooleanExample {
    public static void main(String[] args) {
        boolean isRaining = true;
        boolean isSunny = false;
        boolean isWeekend = true;

        System.out.println("Is it raining? " + isRaining);
        System.out.println("Is it sunny? " + isSunny);
        System.out.println("Is it the weekend? " + isWeekend);

        // Logical operators
        boolean isRainyAndSunny = isRaining && isSunny;
        System.out.println("Is it both raining and sunny? " + isRainyAndSunny);

        boolean isRainyOrSunny = isRaining || isSunny;
        System.out.println("Is it either raining or sunny? " + isRainyOrSunny);

        boolean isNotRaining = !isRaining;
        System.out.println("Is it not raining? " + isNotRaining);

        // Conditional statements
        if (isRaining) {
            System.out.println("Remember to take an umbrella!");
        } else {
            System.out.println("No need for an umbrella.");
        }

        if (isSunny && isWeekend) {
            System.out.println("It's a great time for outdoor activities!");
        } else {
            System.out.println("Let's find something else to do.");
        }
    }
}
