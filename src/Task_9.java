import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers?");
        int n = sc.nextInt();
        int[] tab = new int[n];

        System.out.println("Give " + n + " numbers: ");
        for (int i = 0; i < n; i++) {
            tab[i] = sc.nextInt();
        }
        System.out.println("Give number x: ");
        int x = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (tab[i] == x) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("There is number " + x + " in the array");
        } else {
            System.out.println("There is no number " + x + " in the array");
        }
    }
}
