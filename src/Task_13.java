import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Give word: ");
        String word = sc.nextLine();

        char[] signs = word.toCharArray();

        for (int i = 0; i < signs.length; i++) {
            System.out.print(signs[i] + " ");
        }
    }
}
