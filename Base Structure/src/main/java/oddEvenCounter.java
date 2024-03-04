import java.util.Scanner;

public class oddEvenCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("number: ");
        String number = scanner.nextLine();

        System.out.print("searchForEven = ");
        boolean searchForEven = scanner.nextBoolean();

        int count = oddEvenCounter(number, searchForEven);
        System.out.println(count);

        scanner.close();
    }

    public static int oddEvenCounter(String number, boolean searchForEven) {
        int count = 0;
        for (int i = 0; i < number.length(); i++) {
            int digit = Character.getNumericValue(number.charAt(i));
            if ((searchForEven && digit % 2 == 0) || (!searchForEven && digit % 2 != 0)) {
                count++;
            }
        }
        return count;
    }
}