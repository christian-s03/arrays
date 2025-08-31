public class Task_17 {
    public static void main(String[] args) {
        int[][] tab = {
                {1, 2, 3},
                {4, 5, 6},
        };


        for (int j = 0; j < 3; j++) {
            int sum = 0;
            for (int i = 0; i < 2; i++) {
                sum += tab[i][j];
            }
            System.out.println("Result of " + (j+1) + " row:" + sum);
        }
    }
}
