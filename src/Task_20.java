import java.util.Scanner;

public class Task_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] macierz = new int[5][5];

        System.out.println("Give numbers to array 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                macierz[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nFirst macierz:");
        printMacierz(macierz);

        for (int j = 0; j < 5; j++) {
            int temp = macierz[0][j];
            macierz[0][j] = macierz[4][j];
            macierz[4][j] = temp;
        }

        System.out.println("\nAfter switch first and last number in macierz:");
        printMacierz(macierz);

        for (int i = 0; i < 5; i++) {
            int temp = macierz[i][i];
            macierz[i][i] = macierz[i][4 - i];
            macierz[i][4 - i] = temp;
        }

        System.out.println("\nAfter switch diagonal:");
        printMacierz(macierz);
    }

    public static void printMacierz(int[][] macierz) {
        for (int i = 0; i < macierz.length; i++) {
            for (int j = 0; j < macierz[i].length; j++) {
                System.out.printf("%4d", macierz[i][j]);
            }
            System.out.println();
        }
    }
}
