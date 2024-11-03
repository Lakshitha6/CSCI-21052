import java.util.*;

public class Department {

    private String name;
    Lecturer departmentHead;
    private List<Course> coursesOffering = new ArrayList<>();
    private List<Lecturer>  lecturersBelongsTo = new ArrayList<>();

    public Department(String name, Lecturer departmentHead, List<Course> coursesOffering, List<Lecturer> lecturersBelongsTo) {
        this.name = name;
        this.departmentHead = departmentHead;
        this.coursesOffering = coursesOffering;
        this.lecturersBelongsTo = lecturersBelongsTo;
    }

    public Department(String softwareEngineering, String facultyOfComputingAndTechnology, String bict, String s) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayInfo(){
        System.out.println("Department name: " + name);
        System.out.println("Department head: " + departmentHead + "\n");

        System.out.println("Offering courses : \n");
        for (Course offeredCourses: coursesOffering){
            System.out.println(offeredCourses);
        }

        System.out.println("Lectures names : \n");
        for (Lecturer lecturer: lecturersBelongsTo){
            System.out.println(lecturer);
        }
    }

    public void appointDepartmentHead(Lecturer lecturer) {
        this.departmentHead = lecturer;
    }

    public void displayDepartmentHeadInfo() {
        if (departmentHead != null) {
            departmentHead.displayInfo();
        } else {
            System.out.println("Department head not available.....");
        }
    }

    public void offerCourse(Course course) {
        coursesOffering.add(course);
    }

    public void withdrawCourse(Course course) {
        coursesOffering.remove(course);
    }

    public void addLecturer(Lecturer lecturer) {
        lecturersBelongsTo.add(lecturer);
    }

    public void removeLecturer(Lecturer lecturer) {
        lecturersBelongsTo.remove(lecturer);
    }
}