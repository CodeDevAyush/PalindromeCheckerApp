public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "radar";

        char[] chars = word.toCharArray();   // char[]

        int start = 0;
        int end = chars.length - 1;

        boolean isPalindrome = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Original String : " + word);

        if (isPalindrome) {
            System.out.println("Result : It is a PALINDROME");
        } else {
            System.out.println("Result : It is NOT a palindrome");
        }
    }
}