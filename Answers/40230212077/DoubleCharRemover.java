import java.util.Scanner;

public class DoubleCharRemover {
    public static String doubleChar(String word) {
        String result = "";


        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            result += currentChar;


                while (i < word.length() - 1 && currentChar == word.charAt(i + 1)) {
                    i++;
                }

        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        System.out.println("Word after removing consecutive repeated letters: " + doubleChar(word));

        scanner.close();
    }
}