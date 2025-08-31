import java.util.Scanner;

public class Task_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Give number of row: ");
        int row = scanner.nextInt();
        System.out.print("Give number of column: ");
        int columns = scanner.nextInt();

        int[][] macierz = new int[row][columns];


        System.out.print("Give number to macierz: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                macierz[i][j] = scanner.nextInt();
            }
        }
        int max = macierz[0][0];
        int maxI = 0;
        int maxJ = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                if (macierz[i][j] > max) {
                    max = macierz[i][j];
                    maxI = i;
                    maxJ = j;
                }
            }
        }

        System.out.println("Biggest number is : " + max + " on position (" + maxI + ", " + maxJ + ")");

        int[] tab = new int[row * columns];
        int index = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                tab[index++] = macierz[i][j];
            }
        }
    }
}
