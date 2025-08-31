import java.util.Scanner;

public class Task_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give sentence:");
        String sentence = sc.nextLine();

        String otherSentence = sentence.replaceAll("\\s+", "").toLowerCase();

        boolean palindrom = true;
        int n = otherSentence.length();
        for (int i = 0; i < n / 2; i++) {
            if (otherSentence.charAt(i) != otherSentence.charAt(n - 1 - i)) {
                palindrom = false;
                break;
            }
        }

        if (palindrom) {
            System.out.println("Sentence is a palindrom");
        } else {
            System.out.println("Sentence is not a palindrom");
        }
    }
}
