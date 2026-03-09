import java.util.*;

public class PalindromeCheckerApp {

    // Method 1: Reverse String Approach
    public static boolean reverseMethod(String input) {
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    // Method 2: Stack Approach
    public static boolean stackMethod(String input) {
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        Stack<Character> stack = new Stack<>();

        for (char c : cleaned.toCharArray()) {
            stack.push(c);
        }

        for (char c : cleaned.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // Method 3: Deque Approach
    public static boolean dequeMethod(String input) {
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : cleaned.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reverse Method Timing
        long start1 = System.nanoTime();
        boolean result1 = reverseMethod(input);
        long end1 = System.nanoTime();

        // Stack Method Timing
        long start2 = System.nanoTime();
        boolean result2 = stackMethod(input);
        long end2 = System.nanoTime();

        // Deque Method Timing
        long start3 = System.nanoTime();
        boolean result3 = dequeMethod(input);
        long end3 = System.nanoTime();

        System.out.println("\nPalindrome Results:");
        System.out.println("Reverse Method: " + result1);
        System.out.println("Stack Method: " + result2);
        System.out.println("Deque Method: " + result3);

        System.out.println("\nExecution Time (nanoseconds):");
        System.out.println("Reverse Method Time: " + (end1 - start1));
        System.out.println("Stack Method Time: " + (end2 - start2));
        System.out.println("Deque Method Time: " + (end3 - start3));

        scanner.close();
    }
}