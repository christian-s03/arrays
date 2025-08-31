public class Task_11 {
    public static void main(String[] args) {
        int[] tab = {1, 2, 3, 4, 5};
        System.out.println("Original Array: ");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();

        int temp = tab[0];
        tab[0] = tab[tab.length - 1];
        tab[tab.length - 1] = temp;

        System.out.println("Switch first and last number in tab: ");

        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }
    }
}
