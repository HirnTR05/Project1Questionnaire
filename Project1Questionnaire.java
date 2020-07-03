
// the import keyword is used to load in additional Java PACKAGE code for our programs
// in this case, we are loading in the standard "util" package for the Scanner class
import java.util.*; // anything after the // is a comment


// we use the class keyword to denote an OBJECT
// an object is simply a collection of PROPERTIES (variables)
// and METHODS (functions) that relate to each other
public class Project1Questionnaire {

  // all of our Java programs will have a "main method"
  // this is the ENTRY POINT of our program
  // the keywords prior to main:
  // - public: denotes the access permissions for other objects
  // - static: denotes procedural style code (i.e., not Object Oriented)
  // - void: the return type of the method (in this case NOTHING)
  public static void main(String[] args) {


    // initialize a variable of type OBJECT Scanner and call its CONSTRUCTOR with the System.in parameter)
    Scanner user_input = new Scanner(System.in);

    // a standard Java method for output of a STRING LITERAL
    // the \n denotes a "carriage return" - or blank line
    System.out.println("Questionnaire\n\n");

    System.out.println("Enter First Name:");
    System.out.println("Enter Last Name:");
    System.out.println("Enter Date of Birth:");
    System.out.println("Enter College Major:");
    System.out.println("Enter Class Goal:");
    System.out.println("Enter Dream Job :");

    // initialize a STRING VARIABLE and call the Scanner.nextLine() of user_input
    String First_Name = user_input.nextLine();
    String Last_Name = user_input.nextLine();
    String Date_of_Birth = user_input.nextLine();
    String College_Major = user_input.nextLine();
    String Class_Goal = user_input.nextLine();
    String Dream_Job = user_input.nextLine();

    System.out.println("\n\n\n\n");

    // perform String concatenation using the + operator and output the result to the console
    System.out.println("First Name:" + First_Name);
    System.out.println("Last Name:" + Last_Name);
    System.out.println("Date of Birth:" + Date_of_Birth);
    System.out.println("College Major:" + College_Major);
    System.out.println("Class Goal:" + Class_Goal);
    System.out.println("Dream Job:" + Dream_Job);
    System.out.println("Are the answers you entered above correct?");
  }
}
