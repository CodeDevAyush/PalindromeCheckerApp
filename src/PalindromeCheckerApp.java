public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equals(reversed)) {
            System.out.println("Hardcoded String : " + word);
            System.out.println("Result : It is a PALINDROME");
        } else {
            System.out.println("Hardcoded String : " + word);
            System.out.println("Result : It is NOT a palindrome");
        }

    }
}