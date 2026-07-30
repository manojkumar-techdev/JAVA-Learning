// user input 
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        System.out.println("You entered " + number1);
    }
}



// user input detailed explanation
// Import the Scanner class to use for taking input
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Use the nextInt() method to read an integer input from the user
        int number = scanner.nextInt();  // Example: 25

        // Display the entered integer
        System.out.println("You entered: " + number);
        
        // Close the Scanner to free up resources
        scanner.close();
    }
}
