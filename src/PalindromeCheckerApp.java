import java.util.Scanner;

class PalindromeChecker {

    public boolean checkPalindrome(String input) {

        input = input.replaceAll("\\s+", "").toLowerCase();

        char[] stack = new char[input.length()];
        int top = -1;

        for (int i = 0; i < input.length(); i++) {
            stack[++top] = input.charAt(i);
        }

        for (int i = 0; i < input.length(); i++) {
            char popped = stack[top--];
            if (input.charAt(i) != popped) {
                return false;
            }
        }

        return true;
    }
}

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        PalindromeChecker checker = new PalindromeChecker();

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}