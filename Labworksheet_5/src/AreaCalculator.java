public class AreaCalculator {

    public static int calculateRectangleArea(int length, int width){
        return width * length ;
    }

    public static int calculateSquareArea(int sideLength){
        return sideLength * sideLength ;
    }

    public static void main(String[] args) {
        int rectangleLength = 5 ;
        int rectangleWidth = 8 ;
        int squareSideLength = 4 ;

        System.out.println(calculateRectangleArea(rectangleLength,rectangleWidth));
        System.out.println(calculateSquareArea(squareSideLength));
    }
}