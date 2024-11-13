 import java.util.Scanner;

public class SpoonerismGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SpoonerismGenerator spoonerismGenerator = new SpoonerismGenerator();
        System.out.print("Word 1: ");
        String word1 = scanner.nextLine();
        System.out.print("Word 2: ");
        String word2 = scanner.nextLine();
        spoonerismGenerator.run(word1, word2);
    }

    public void run(String word1, String word2) {
        int vowelIndex1 = vowelIndex(word1);
        int vowelIndex2 = vowelIndex(word2);

        if (vowelIndex1 == -1 || vowelIndex2 == -1) {
            System.out.println(word1 + " and " + word2 + " are not good words to spoonerize.");
            return;
        }

        String swappedWord1 = swapConsonants(word1, vowelIndex1, word2, vowelIndex2);
        String swappedWord2 = swapConsonants(word2, vowelIndex2, word1, vowelIndex1);

        System.out.println(word1 + " and " + word2 + " spoonerized are " + swappedWord1 + " " + swappedWord2);
    }

    private String swapConsonants(String word1, int vowelIndex1, String word2, int vowelIndex2) {
        StringBuilder sb = new StringBuilder(word1);
        if (vowelIndex1 > 0) {
            sb.setCharAt(0, word2.charAt(0));
        }
        return sb.toString();
    }

    private int vowelIndex(String word) {
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (isVowel(ch)) {
                return i;
            }
        }
        return -1;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
