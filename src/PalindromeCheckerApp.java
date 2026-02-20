import java.util.Stack;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String word = "noon";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        boolean isPalindrome = true;
        for (int i = 0; i < word.length(); i++) {
            char poppedChar = stack.pop();

            if (word.charAt(i) != poppedChar) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Original String : " + word);

        if (isPalindrome) {
            System.out.println("Result : It is a PALINDROME");
        } else {
            System.out.println("Result : It is NOT a palindrome");
        }
    }
}