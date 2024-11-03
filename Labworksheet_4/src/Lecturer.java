import java.util.*;

public class Lecturer extends Person{

    private String position;
    Department department;
    private List<Course> coursesTeaching = new ArrayList<>();

    public Lecturer(String name, String position, Department department, List<Course> coursesTeaching) {
        super(name);
        this.position = position;
        this.department = department;
        this.coursesTeaching = coursesTeaching;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public void displayInfo() {
        System.out.println("Lecturer Name: " + getName());
        System.out.println("Position: " + position);
        System.out.println("Department: " + department);
        System.out.println("Course Teaching: " + coursesTeaching);
    }

    public void displayDepartmentInfo() {
        if (department != null) {
            department.displayInfo();
        } else {
            System.out.println("No department assigned.");
        }
    }

    public void addCourse(Course course){
        coursesTeaching.add(course);
    }

    public void removeCourse(Course course){
        coursesTeaching.remove(course);
    }

    public void listCoursesTeaching(){
        System.out.println("----------Details of courses----------\n");
        for (Course course : coursesTeaching){
            course.displayInfo();
        }
    }

}