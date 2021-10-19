import java.util.Scanner;

public class StringUtilsClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Something: ");
        String userInput = scanner.nextLine();

        boolean isNumber = StringUtils.isNumber(userInput);
        String switchCase = StringUtils.swapCase(userInput);
        String reverseString = StringUtils.reverse(userInput);

        System.out.println("Is the string a number: " + isNumber);
        System.out.println("Flipped case: " + switchCase);
        System.out.println("Reversed: " + reverseString);
    }
}
