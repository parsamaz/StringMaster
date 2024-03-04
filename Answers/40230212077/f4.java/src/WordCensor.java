import java.util.Scanner;

public class WordCensor {
    public static String wordCensor(String sentence, String word, String newWord) {
        String[] words = sentence.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word)) {
                words[i] = newWord;
            }
            result += words[i];
            if (i < words.length - 1) {
                result += " ";
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("sentence = ");
        String sentence = scanner.nextLine();

        System.out.print("word = ");
        String word = scanner.next();

        System.out.print("newWord = ");
        String newWord = scanner.next();

        System.out.println(wordCensor(sentence, word, newWord));

        scanner.close();
    }
}


