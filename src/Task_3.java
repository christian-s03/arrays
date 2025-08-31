import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] tab = new int[n];

        for (int i = 0; i < n; i++) {
            tab[i] = i + 1;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(tab[i] + " ");
        }
    }
}
