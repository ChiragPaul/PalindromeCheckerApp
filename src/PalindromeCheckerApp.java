public class PalindromeCheckerApp {
    public static boolean isPalindrome(String str) {
        char[] chars = str.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            if (chars[start] != chars[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "radar";
        System.out.println(isPalindrome(input));
    }
}