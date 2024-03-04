import java.util.Scanner;

public class NameNormalizer {
    public static String normalizeName(String firstName, String lastName) {
        String normalizedFirstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        String normalizedLastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase();
        String fullName = normalizedFirstName + " " + normalizedLastName;
        return fullName;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("firstName = ");
        String firstName = scanner.nextLine();

        System.out.print("lastName = ");
        String lastName = scanner.nextLine();

        System.out.println( normalizeName(firstName, lastName));

        scanner.close();
    }
}