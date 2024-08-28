import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first word: ");

        String word1 = scanner.nextLine();

        System.out.println("Enter second word: ");

        String word2 = scanner.nextLine();

        if (word1.length()%2 == 0 && word2.length()%2 == 0) {
            int halfw1 = word1.length() / 2;
            int halfw2 = word2.length() /2;

            String newWord = word1.substring(halfw1) + word2.substring(halfw2);

            System.out.println("New word: " + newWord);

        }
    }
}
