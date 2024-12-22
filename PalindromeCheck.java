import java.util.Scanner;
public class PalindromeCheck {

    public static boolean isPalindrome(String str) {
        
        str = str.toLowerCase();

        
        String reversed = new StringBuilder(str).reverse().toString();

        
        return str.equals(reversed);
    }

    public static void main(String[] args) {
		 Scanner entry = new Scanner(System.in);
		 
		 System.out.println("Enter any word to check: ");
        String input = entry.next();
        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }
}
