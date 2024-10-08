import java.util.*;

public class Question_2 {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        int x;
        String y;

    do {
        System.out.print("Enter Integer: ");
        x = myScan.nextInt();

        if (x<0){
            System.out.println("Negative Integer !");
            break;
        }

        y = Integer.toString(x);
        System.out.println("Length of integer : " + y.length());

    }while (x>0);
    }
}