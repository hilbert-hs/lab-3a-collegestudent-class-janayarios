import java.util.Scanner;

class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);


    System.out.println("Would you like to create a new student? [y/n]: ");
    String userInput = scan.nextLine();
    // write a while loop to create and display CollegeStudnets using the below method;
    
    while ( (userInput.toLowerCase().equals("y")) ) {

      createStudent(scan);

      System.out.println("Would you like to create a new student? [y/n]: ");
      userInput = scan.nextLine();

    }

  }

  private static CollegeStudent createStudent(Scanner scan) {
    // complete this method to create a CollegeStudent object with details provided by the user
  
    System.out.println("Enter student name: ");
    String user_studentName = scan.nextLine();

    System.out.println("Enter course title: ");
    String user_courseTitle = scan.nextLine();

    System.out.println("Enter course number: ");
    String user_courseNumber = scan.nextLine();

    System.out.println("Enter student credits: ");
    int user_studentCredits = scan.nextInt();
    scan.nextLine(); // allows the while loop in "main" to work

    System.out.println("");
    System.out.println("---Your new student---");
    System.out.println("Name: " + user_studentName);
    System.out.println("Course Title: " + user_courseTitle);
    System.out.println("Course Number: " + user_courseNumber);
    System.out.println("Student Credits: " + user_studentCredits);
    System.out.println("----------------------");
    System.out.println("");


    return new CollegeStudent(user_studentName, user_courseTitle, user_courseNumber, user_studentCredits);

  }
    
}
