public class Task_10 {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5};
        System.out.println("Normal order: ");
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
        System.out.println("Reverse order: ");
        for (int i = tab.length - 1; i >= 0; i--) {
            System.out.println(tab[i]);
        }
    }
}
