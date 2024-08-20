import java.util.Scanner;

public class CircularRegionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter inner radius r_i: ");
        double r_i = scanner.nextDouble();

        System.out.print("Enter outer radius r_o: ");
        double r_o = scanner.nextDouble();

        Circle innerCircle = new Circle(r_i);
        Circle outerCircle = new Circle(r_o);

        double areaOfCircularRegion = outerCircle.computeArea() - innerCircle.computeArea();

        System.out.println("The area of the circular region is: " + areaOfCircularRegion);

        scanner.close();
    }
}