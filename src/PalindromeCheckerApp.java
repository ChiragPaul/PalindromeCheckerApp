/**
 * =========================================
 * MAIN CLASS - UseCase1PalindromeApp
 * ==========================================
 */


public class PalindromeCheckerApp {

    public static void main(String[] args) {
        String str = "madam";
        boolean isPalindrome = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("\nInput Text:"+str);
            System.out.println("Is it a Palindrome? : true");
        } else {
            System.out.println("\nInput Text:"+str);
            System.out.println("Is it a Palindrome? : false");
        }
    }
}