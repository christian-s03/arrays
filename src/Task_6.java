import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers: ");
        int n = sc.nextInt();
        int[] tab = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Give number: ");
            tab[i] = sc.nextInt();
        }

        int max = tab[0];
        for (int i = 0; i < n; i++) {
            if (max < tab[i]) {
                max = tab[i];
            }
        }
        System.out.println("Biggest number in tab is: " + max);
    }
}
