import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers: ");
        int n = sc.nextInt();
        int[] tab = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Give number: ");
            tab[i] = sc.nextInt();
        }

        int min = tab[0];
        for (int i = 0; i < n; i++) {
            if (min > tab[i]) {
                min = tab[i];
            }
        }
        System.out.println("The smallest number in tab is: " + min);
    }
}
