import java.util.Scanner;

public class Question_5 {

        public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                String sentence = scan.nextLine();
                String lowerSentence = sentence.toLowerCase();
                String regex = "[,\\.\\s,!]";
                String [] splited = lowerSentence.split(regex);
                String splitedSentence = String.join("", splited);
                String removeCharacters = lowerSentence.replaceAll(regex,"");

                boolean equarlOrNot = splitedSentence.equals(removeCharacters);

                if (!equarlOrNot){
                        System.out.println("Not palindrome");
                }

                else
                        System.out.println("Palindrome");

        }

}