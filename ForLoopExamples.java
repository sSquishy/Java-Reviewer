import java.util.Scanner;

class ForLoopExamples{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        //For loop
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
          }

        //Nested Loop
            // Outer loop
        for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); // Executes 2 times
            
            // Inner loop
            for (int j = 1; j <= 3; j++) {
            System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        } 
    }

}