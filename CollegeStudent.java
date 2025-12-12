// Create your CollegeStudent class here
public class CollegeStudent {


    
    private String name;
    private String courseTitle;
    private String courseNumber;
    private int credits;
    private int courseFee;
    private static int nextStudentID = 1;
    private int costPerCredit = 125;
    private int studentID;

    public CollegeStudent() {
        studentID = nextStudentID;
        nextStudentID++;
    }

    public CollegeStudent(String _name) {
        name = _name;
        studentID = nextStudentID;
        nextStudentID++;
    }

    public CollegeStudent(String _name, String _courseTitle, String _courseNumber, int _credits) {
        name = _name;
        courseTitle = _courseTitle;
        courseNumber = _courseNumber;
        credits = _credits;
        courseFee = costPerCredit * credits;
        studentID = nextStudentID;
        nextStudentID++;
    }

    public void setName(String _name) {
        name = _name;
    }

    public void setCourseTitle(String _courseTitle) {
        courseTitle = _courseTitle;
    }

    public void setCourseNumber(String _courseNumber) {
        courseNumber = _courseNumber;
    }

    public void setCredits(int _credits) {
        credits = _credits;
        courseFee = costPerCredit * credits;
    }


    public String getName() {
        return name;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public int getCredits() {
        return credits;
    }

    public int getCourseFee() {
        return courseFee;
    }

    public int getStudentID() {
        return studentID;
    }

    public void printAttributes() {
        System.out.println("Name: " + name);
        System.out.println("Course Title: " + courseTitle);
        System.out.println("Course Number: " + courseNumber);
        System.out.println("Credits: " + credits);
        System.out.println("Course Fee: " + courseFee);
    }


}