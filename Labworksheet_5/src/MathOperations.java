public class MathOperations {
    private static double pi = 3.14159 ;

    public double calculateCircleArea(int radius){
        return pi* radius * radius ;
    }

    public double calculateSquareArea(int side){
        return side* side ;
    }

    public double getPi(){
        return pi;
    }
}