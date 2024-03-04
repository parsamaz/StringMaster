import java.util.Scanner;

public class WordFinder {
    public static  String Words(String sentence, int number) {

        String[] words = sentence.split(" ");


        if (number > 0 && number <= words.length) {

            return words[number - 1];
        } else {
            String x = "Number = ";
            String s = " is out Of Bound";
            return x+number+ s;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("sentence = ");
        String sentence = scanner.nextLine();


        System.out.print("number: ");
        int number = scanner.nextInt();


        String result = Words(sentence, number);
        System.out.println( result);

        scanner.close();
    }
}