import java.util.*;

public class Question_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] x = new int[5];

        for (int i = 0 ; i < 5 ; i++){
            System.out.print("Enter "+ (i+1) + " number: ");
            x[i] = scan.nextInt();
        }
        Arrays.sort(x);

            System.out.print("\nSecond largest number: " +x[x.length -2] );

    }
}
