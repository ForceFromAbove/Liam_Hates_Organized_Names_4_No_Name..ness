/*
 * Exercise 2.15
*/
import java.util.Scanner;

public class Liam_Hates_Organized_Names_4_No_Nameness {

    public static void main( String[] args ){
        Scanner user_Input = new Scanner(System.in);    // Used to get input from user

        double user_Number1;                            // Numbers given by user
        double user_Number2;

        double sum;                                     // Operand produced for user
        double product;
        double difference;
        double quotient;

        // Message given to user before requesting information
        System.out.println("This program will: Add, Multiply, Subtract, and Divide Number 2 from Number 1");
        System.out.println("ie: this program will subtract and divide Number 2 from Number 1.");
        System.out.println("This program should handle difficult numbers, since it is a double data type.");

        System.out.println("Please enter decimal Number 1:");   // Reads in first double (Number 1)
        user_Number1 = user_Input.nextDouble();

        System.out.println("Please enter decimal Number 2:");   // Reads in first double (Number 2)
        user_Number2 = user_Input.nextDouble();

        // Addition, Multiplication, Subtraction, and Division
        sum = user_Number1 + user_Number2;
        product = user_Number1 * user_Number2;
        difference = user_Number1 - user_Number2;
        quotient = user_Number1 / user_Number2;

        // Print out the results of user input
        System.out.printf("Sum: %f%n", sum);
        System.out.printf("Product: %f%n", product);
        System.out.printf("Difference: %f%n", difference);
        System.out.printf("Quotient: %f%n", quotient);

    }
}

/*
*
* Eventually
*
* You
*
* Shall
*
* See
*
* My
*
* Beautiful
*
* Wonderful
*
* Name
*
* You
*
* Handsome
*
* Devil.
*
* Liam,
*
* My
*
* Name
*
* Is
*
* ...
*
* Inigo Montoya!
*
* You
*
* Killed
*
* My
*
* Father.
*
* Prepare
*
* To
*
* Die.
*
* Okay,
*
* But
*
* Seriously
*
* This
*
* Is:
*
* Aaron
*
* Ewing
*
* :)
*
* PS: Please let me know what you would like to see next time for submission
* (ie just a .java, or what?) Thanks!
*
*/