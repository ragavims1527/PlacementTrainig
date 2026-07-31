import java.util.*;
public class String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        java.lang.String str = sc.nextLine();
        System.out.print("Uppercase characters: ");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                System.out.print(ch + " ");
            }
        }
        System.out.print("\nLowercase characters: ");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLowerCase(ch)) {
                System.out.print(ch + " ");
            }
        }
        System.out.print("\nDigits: ");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                System.out.print(ch + " ");
            }
        }
        System.out.print("\nSpecial characters: ");
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                System.out.print(ch + " ");
            }
        }
        sc.close();
    }
}