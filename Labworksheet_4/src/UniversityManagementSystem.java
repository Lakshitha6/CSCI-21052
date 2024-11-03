import java.util.*;

public class UniversityManagementSystem {

    public static void main(String[] args) {

        Department department_1 = new Department("Software Engineering","Faculty of computing and technology","CS","Mr.Keshavan");
        Degree degree_1 = new Degree("Computer Science", 67, new ArrayList<>());

        List<Course> coursesTeaching = new ArrayList<>();

        Lecturer lecturer1 = new Lecturer("Dr. Kasun", "Professor", department_1, coursesTeaching);

        Course course1 = new Course("Cyber Security", "Mandatory", 40, lecturer1, degree_1);
        Course course2 = new Course("Artificial Intelligence", "Mandatory", 45, lecturer1, degree_1);
        Course course3 = new Course("Data Science", "Optional", 30, lecturer1, degree_1);

        List<Course> coursesOffering = new ArrayList<>();
        coursesOffering.add(course1);
        coursesOffering.add(course2);
        coursesOffering.add(course3);

        degree_1 = new Degree("Computer Science", 67, coursesOffering);

        List<Course> coursesEnrolled = new ArrayList<>();
        coursesEnrolled.add(course1);
        coursesEnrolled.add(course2);

        Student student1 = new Student("Kumar gunasekara", "S123", "2nd Year", degree_1, coursesEnrolled);

        student1.displayInfo();
        student1.listCoursesEnrolled();

        department_1.displayInfo();
        department_1.displayDepartmentHeadInfo();

        course1.displayInfo();
        degree_1.displayInfo();
        degree_1.listCoursesOffering();
    }
}