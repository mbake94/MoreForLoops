import java.util.Scanner;

public class Reverse {
    public static void main (String[] args) {
        Scanner keybd = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = keybd.nextLine();
        int length = word.length();
        for (int i = length; i > 0; i--) {
            System.out.printf(String.valueOf(word.charAt(i-1)));
        }
    }

}
