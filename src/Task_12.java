import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of arrays: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] arr2 = new int[n];
        int[] sum = new int[n];

        System.out.println("Give numbers arr: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Give numbers arr2: ");
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            sum[i] = arr[i] + arr2[i];
        }
        System.out.println("Sum of arrays: ");
        for (int i = 0; i < n; i++) {
            System.out.print(sum[i] + " ");
        }
        System.out.println();
    }
}
