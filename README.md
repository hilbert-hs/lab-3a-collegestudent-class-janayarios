[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=21949093)
# Lab_3A_College_Student_Class

For this problem, you will be creating a class and using the Main class to test your output.  Leave the Main class alone for now and create your `CollegeStudent` class in the CollegeStudent file. Define this class as described below.  All variables should be declared as private and all methods as public.  

**Class Name:**	CollegeStudent (do not put public on the class line)

**Static Variable:**	costPerHour = 125 (this should be an int)

**Instance Variables:**	
- `name` – String (in the format lastName, firstName – Example: Smith, John)
- `courseTitle` – String
- `courseNumber` – String
- `credits` – int
- `courseFee` – int

**Instance Methods: 	**
- A default constructor
- A constructor that accepts arguments for `name`, `courseTitle`, `courseNumber`, and `credits` (use the same variable name for the parameter as the instance variables).  Course fee should be set by multiplying the credits and the costPerHour.
- accessor methods for each of the class fields
- mutator methods for each of the class fields – the mutator for `courseFee` should use the `credits` as a parameter and calculate the fee using the `costPerHour` (use `credits` as the parameter variable)
- `toString()` a method to display the fields of an instance of the class in an easy to read format (preferable on separate lines).  Use this when referencing the instance variables.

Complete the Main class to test your CollegeStudent class as follows:

- Create a static method below the main method to get user inputs, this method should:
    - Have one parameter to pass in the scanner that will be created in the main method (`Scanner scan`).  This is necessary because this method will need to get user input, but the scanner will be out of scope from the main method unless you send it in through a parameter.
    - Create a `CollegeStudent` object using the default constructor.
    - Prompt the user for the inputs – First Name, Last Name (as one String), course title, course number, and number of credits.  It should not ask for the course fee.
    - Use the mutator methods to set those values for the object.  Remember that the mutator for the course fee needs the credits.
    - Return the `CollegeStudent` with the values given by the user.
- The main method should use a while loop to accept input until the user indicates there are no more inputs.  Use a boolean flag to control the loop.
- In the loop, call the method to get the input for the College Student and then display the `CollegeStudent` object nicely formatted.  Then prompt the user if they would like to input information for another student (Y for yes and N for no) and set the boolean flag for the loop accordingly.
