import java.util.Scanner;

public class firstWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("wordA = ");
        String wordA = scanner.nextLine();

        System.out.print("wordB = ");
        String wordB = scanner.nextLine();


        if(wordA.length()<=wordB.length()){
            String result = wordA;
            int min = wordA.length();}
        else {
            String result = wordB;
            int min = wordB.length();}

        String first = firstWord(wordA, wordB);
        System.out.println(first);

        scanner.close();
    }

    public static int min(String A, String B){
        if(A.length()<=B.length()){
            int min = A.length();
            return min;}
        else {
            int min = B.length();
            return min;}}

    public static String result(String A, String B){
        if(A.length()<=B.length()){
            String result = A;
            return result;}
        else {
            String result = B;
            return result;}}

    public static String firstWord(String wordA, String wordB) {

        int min = min(wordA,wordB);
        String result = result(wordA,wordB);


        for (int i = 0; i < min; i++) {
            char charA = wordA.charAt(i);
            char charB = wordB.charAt(i);
            if (charA < charB) {
                return wordA;
            } else if (charA > charB) {
                return wordB;
            }
        }
        return result;
    }
}