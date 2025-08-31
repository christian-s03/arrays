public class Task_14 {
    public static void main(String[] args) {
        int[][] macierz = new int[3][3];
        int number = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                macierz[i][j] = number;
                number++;
            }
        }
        System.out.println("Macierz 3x3: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
