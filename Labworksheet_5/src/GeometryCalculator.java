public class GeometryCalculator {


    public static void main(String[] args) {
    MathOperations math = new MathOperations();
        System.out.println("Pi value: " + math.getPi());
        System.out.println("Area of the circle: " + math.calculateCircleArea(5));
        System.out.println("Area of the square: " + math.calculateSquareArea(4));
    }
}