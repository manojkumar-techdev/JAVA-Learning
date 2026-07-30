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



// read the user's input directly and use it in an output statement
// Importing the Scanner class for user input
import java.util.Scanner; 

class Codechef {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Read the user's input directly and use it in an output statement
        // No variable is used to store the input; it is passed directly
        System.out.println("Oh, " + scanner.nextInt() + " is a great choice!");
        
        // Close the Scanner to release system resources
        scanner.close();
    }
}



// store the input in a variable before printing it
import java.util.Scanner;

class Codechef {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        System.out.println("Here is your number again: " + number);

        scanner.close();
    }
}
