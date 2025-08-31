public class Task_16 {
    public static void main(String[] args) {
        int[][] tab = {
                {1, 2, 3},
                {4, 5, 6},
        };

        for (int i = 0; i < tab.length; i++) {
            int sum = 0;
            for (int j = 0; j < tab[i].length; j++) {
                sum += tab[i][j];
            }
            System.out.println("Result of " + (i+1) + " row: " + sum);
        }
    }
}
