import java.util.*;

public class Degree {

    private String name;
    private int numberOfStudents;
    private List<Course> coursesOffering = new ArrayList<>();

    public Degree(String name, int numberOfStudents, List<Course> coursesOffering) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.coursesOffering.addAll(coursesOffering);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public void displayInfo(){
        System.out.println("Degree name: " + name);
        System.out.println("Number of students: " + numberOfStudents);
    }

    public void offerCourse(Course course){
        coursesOffering.add(course);
    }

    public void withdrawCourse(Course course){
        coursesOffering.remove(course);
    }

    public void  listCoursesOffering(){
        System.out.println("------- Offering courses-------\n");
        for (Course course: coursesOffering){
            course.displayInfo();
        }
    }
}