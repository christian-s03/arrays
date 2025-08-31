public class Task_5 {
    public static void main(String[] args) {

        int[] tab = {33, 41, 6, 3, 2, 77, 2, 12}; // 176
        int sum = 0;
        double result = 0;

        for (int i = 0; i < tab.length; i++) {
            sum += tab[i];
        }
        result = sum / tab.length;
        System.out.println("Arithmetic mean is: " + result);
    }
}
