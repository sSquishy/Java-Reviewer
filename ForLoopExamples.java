import java.util.Scanner;

class ForLoopExamples{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

         // For loop with increment
         System.out.println("For loop with increment:");
         for (int i = 1; i <= 5; i++) {
             System.out.println("Iteration " + i);
         }
 
         System.out.println("-------------------------");
 
         // For loop with decrement
         System.out.println("For loop with decrement:");
         for (int i = 5; i >= 1; i--) {
             System.out.println("Iteration " + i);
         }
 
         System.out.println("-------------------------");
 
         // For-each loop for arrays
         System.out.println("For-each loop for arrays:");
         int[] numbers = {1, 2, 3, 4, 5};
         for (int number : numbers) {
             System.out.println("Number: " + number);
         }
 
         System.out.println("-------------------------");
 
         // For loop with user input
         System.out.println("For loop with user input:");
         long n;
         System.out.print("Enter the value of n: ");
         n = myObj.nextInt();
         int factorial = 1;
         for (int i = 1; i <= n; i++) {
             factorial *= i;
         }
         System.out.println("Factorial of " + n + " is: " + factorial);

         myObj.close();
    }

}