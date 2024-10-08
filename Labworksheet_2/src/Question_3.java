import java.util.*;

public class Question_3 {

    int spaces , rows;

    public static void main(String[] args) {

        Question_3 obj = new Question_3();
        System.out.print("Enter number of rows: ");
        Scanner myScan = new Scanner(System.in);
        obj.rows = myScan.nextInt();
        obj.spaces = obj.rows+2;

        for (int i = 0; i < obj.rows; i++) {

            for (int j = obj.spaces; j > 0; j--) {
                System.out.print(" ");
            }

            for (int j = i; j >=0; j--) {
                System.out.print(" *");
            }
            System.out.println("");
            obj.spaces--;

        }

    }

}