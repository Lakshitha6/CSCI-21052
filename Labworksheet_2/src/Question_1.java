public class Question_1 {
    public static void main(String[] args) {
        for (int i = 10 ; i < 41 ; i++ ){
            for (int j = 0 ; j< 10 ; j++){
                System.out.print(i+j);
                System.out.print(" ");
            }
            i+=9;
            System.out.println("");
        }
    }
}
