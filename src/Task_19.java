public class Task_19 {
    public static void main(String[] args) {
        int[][] macierz = new int[10][10];

        int number = 1;
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                macierz[i][j] = number++;
            }
        }
        System.out.println("Array 10x10: ");
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                System.out.printf("%4d",macierz[i][j]);   //formatowanie tabel w ladny sposob
            }
            System.out.println();
        }
        System.out.println("\nDiagonal: ");
        for (int i = 0; i < 10; i++){
            System.out.print(macierz[i][i] + " ");
        }
    }
}
