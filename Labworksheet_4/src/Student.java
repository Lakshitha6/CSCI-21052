import java.util.*;

public class Student extends Person{
    private String studentID;
    private String year;
    private Degree degree;
    private List<Course> coursesEnrolled = new ArrayList<>();

    public Student(String name, String studentID, String year, Degree degree, List<Course> coursesEnrolled) {
        super(name);
        this.studentID = studentID;
        this.year = year;
        this.degree = degree;
        this.coursesEnrolled = coursesEnrolled;
    }

    public void displayInfo(){
        System.out.println("Student Name: " + getName());
        System.out.println("Student ID: " + studentID);
        System.out.println("Year: " + year);
        System.out.println("Degree: " + degree);
        System.out.println("Enrolled course: " + coursesEnrolled);
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void registerDegree(Degree degree) {
        this.degree = degree;
    }

    public void displayDegreeInfo(){
        if (degree != null) {
            degree.displayInfo();
        } else {
            System.out.println("No degree registered.");
        }
    }

    public void enrollCourse(Course course){
        coursesEnrolled.add(course);
    }

    public void unenrollCourse(Course course){
        coursesEnrolled.remove(course);
    }

    public void  listCoursesEnrolled(){
        System.out.println(getName() + " Enrolled courses are -----------\n");
        for (Course course : coursesEnrolled) {
            course.displayInfo();
        }
    }

}