import java.util.Deque;
import java.util.LinkedList;
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "refer";

        Deque<Character> deque = new LinkedList<>();

        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i));
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear  = deque.removeLast();

            if (front != rear) {
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