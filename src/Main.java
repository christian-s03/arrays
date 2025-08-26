import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Task 1

//        int[] tab = {1, 2, 3, 4, 5};
//        for (int i = 0; i < tab.length; i++) {
//            System.out.println(tab[i]);
//        }

        // Task 2

//        String[] imiona = {"Christian", "Kuba", "Krzychu"};
//        for (int i = 0; i < imiona.length; i++) {
//            System.out.println("Hi, " + imiona[i]);
//        }

        // Task 3

//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//        int[] tab = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            tab[i] = i + 1;
//        }
//
//        for (int i = 0; i < n; i++) {
//            System.out.print(tab[i] + " ");
//        }

        // Task 4

//        int[] tab = {3, 4, 12, 44, 2, 4}; // 69
//        int sum = 0;
//
//        for (int i = 0; i <= 5; i++) {
//            sum += tab[i];
//        }
//        System.out.println("Result of adding the tab is: " + sum);

        // Task 5

//        int[] tab = {33, 41, 6, 3, 2, 77, 2, 12}; // 176
//        int sum = 0;
//        double result = 0;
//
//        for (int i = 0; i < tab.length; i++) {
//            sum += tab[i];
//        }
//        result = sum / tab.length;
//        System.out.println("Arithmetic mean is: " + result);

        // Task 6

//        Scanner sc = new Scanner(System.in);
//        System.out.println("How many numbers: ");
//        int n = sc.nextInt();
//        int[] tab = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            System.out.println("Give number: ");
//            tab[i] = sc.nextInt();
//        }
//
//        int max = tab[0];
//        for (int i = 0; i < n; i++) {
//            if (max < tab[i]) {
//                max = tab[i];
//            }
//        }
//        System.out.println("Biggest number in tab is: " + max);

        // Task 7

//        Scanner sc = new Scanner(System.in);
//        System.out.println("How many numbers: ");
//        int n = sc.nextInt();
//        int[] tab = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            System.out.println("Give number: ");
//            tab[i] = sc.nextInt();
//        }
//
//        int min = tab[0];
//        for (int i = 0; i < n; i++) {
//            if (min > tab[i]) {
//                min = tab[i];
//            }
//        }
//        System.out.println("The smallest number in tab is: " + min);

        // Task 8

//        Scanner sc = new Scanner(System.in);
//        System.out.println("How many numbers: ");
//        int n = sc.nextInt();
//        int[] tab = new int[n];
//
//        System.out.println("Give " + n + " numbers: ");
//        for (int i = 0; i < n; i++) {
//            tab[i] = sc.nextInt();
//        }
//        System.out.println("Give number x: ");
//        int x = sc.nextInt();
//
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            if (tab[i] == x) {
//                sum++;
//            }
//        }
//        System.out.println("Sum of " + x + " numbers: " + sum);

        // Task 9

//        Scanner sc = new Scanner(System.in);
//        System.out.println("How many numbers?");
//        int n = sc.nextInt();
//        int[] tab = new int[n];
//
//        System.out.println("Give " + n + " numbers: ");
//        for (int i = 0; i < n; i++) {
//            tab[i] = sc.nextInt();
//        }
//        System.out.println("Give number x: ");
//        int x = sc.nextInt();
//        boolean found = false;
//
//        for (int i = 0; i < n; i++) {
//            if (tab[i] == x) {
//                found = true;
//                break;
//            }
//        }
//        if (found) {
//            System.out.println("There is number " + x + " in the array");
//        } else {
//            System.out.println("There is no number " + x + " in the array");
//        }

        // Task 10

//        int[] tab = {1, 2, 3, 4, 5};
//        System.out.println("Normal order: ");
//        for (int i = 0; i < tab.length; i++) {
//            System.out.println(tab[i]);
//        }
//        System.out.println("Reverse order: ");
//        for (int i = tab.length - 1; i >= 0; i--) {
//            System.out.println(tab[i]);
//        }

        // Task 11

//        int[] tab = {1, 2, 3, 4, 5};
//        System.out.println("Original Array: ");
//        for (int i = 0; i < tab.length; i++) {
//            System.out.print(tab[i] + " ");
//        }
//        System.out.println();
//
//        int temp = tab[0];
//        tab[0] = tab[tab.length - 1];
//        tab[tab.length - 1] = temp;
//
//        System.out.println("Switch first and last number in tab: ");
//
//        for (int i = 0; i < tab.length; i++) {
//            System.out.print(tab[i] + " ");
//        }

        // Task 12

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Size of arrays: ");
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//        int[] arr2 = new int[n];
//        int[] sum = new int[n];
//
//        System.out.println("Give numbers arr: ");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Give numbers arr2: ");
//        for (int i = 0; i < n; i++) {
//            arr2[i] = sc.nextInt();
//        }
//        for (int i = 0; i < n; i++) {
//            sum[i] = arr[i] + arr2[i];
//        }
//        System.out.println("Sum of arrays: ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(sum[i] + " ");
//        }
//        System.out.println();

        // Task 13

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Give word: ");
//        String word = sc.nextLine();
//
//        char[] signs = word.toCharArray();
//
//        for (int i = 0; i < signs.length; i++) {
//            System.out.print(signs[i] + " ");
//        }

        // Task 14

//        int[][] macierz = new int[3][3];
//        int number = 1;
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                macierz[i][j] = number;
//                number++;
//            }
//        }
//        System.out.println("Macierz 3x3: ");
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(macierz[i][j] + " ");
//            }
//            System.out.println();
//        }

        // Task 15

//        int[][] macierz = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//
//        int sum = 0;
//
//        for (int i = 0; i < macierz.length; i++) {
//            for (int j = 0; j < macierz[i].length; j++) {
//                sum += macierz[i][j];
//            }
//        }

        // Task 16

//        int[][] tab = {
//                {1, 2, 3},
//                {4, 5, 6},
//        };
//
//        for (int i = 0; i < tab.length; i++) {
//            int sum = 0;
//            for (int j = 0; j < tab[i].length; j++) {
//                sum += tab[i][j];
//            }
//            System.out.println("Result of " + (i+1) + " row: " + sum);
//        }

        // Task 17

//        int[][] tab = {
//                {1, 2, 3},
//                {4, 5, 6},
//        };
//
//
//        for (int j = 0; j < 3; j++) {
//            int sum = 0;
//            for (int i = 0; i < 2; i++) {
//                sum += tab[i][j];
//            }
//            System.out.println("Result of " + (j+1) + " row:" + sum);
//        }

        // Task 18

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Give number of row: ");
//        int row = scanner.nextInt();
//        System.out.print("Give number of column: ");
//        int columns = scanner.nextInt();
//
//        int[][] macierz = new int[row][columns];
//
//
//        System.out.print("Give number to macierz: ");
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < columns; j++) {
//                macierz[i][j] = scanner.nextInt();
//            }
//        }
//
//        int max = macierz[0][0];
//        int maxI = 0;
//        int maxJ = 0;
//
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < columns; j++) {
//                if (macierz[i][j] > max) {
//                    max = macierz[i][j];
//                    maxI = i;
//                    maxJ = j;
//                }
//            }
//        }
//
//        System.out.println("Biggest number is : " + max + " on position (" + maxI + ", " + maxJ + ")");
//
//        int[] tab = new int[row * columns];
//        int index = 0;
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < columns; j++) {
//                tab[index++] = macierz[i][j];
//            }
//        }
//
//        Arrays.sort(tab);
//        int thirdBig = tab[tab.length - 3];
//
//        System.out.println("Third biggest number in tab: " + thirdBig);

        // Task 19

//        int[][] macierz = new int[10][10];
//
//        int number = 1;
//        for (int i = 0; i < 10; i++){
//            for (int j = 0; j < 10; j++){
//                macierz[i][j] = number++;
//            }
//        }
//        System.out.println("Array 10x10: ");
//        for (int i = 0; i < 10; i++){
//            for (int j = 0; j < 10; j++){
//                System.out.printf("%4d",macierz[i][j]);   //formatowanie tabel w ladny sposob
//            }
//            System.out.println();
//        }
//        System.out.println("\nDiagonal: ");
//        for (int i = 0; i < 10; i++){
//            System.out.print(macierz[i][i] + " ");
//        }

        // Task 20

//        Scanner sc = new Scanner(System.in);
//        int[][] macierz = new int[5][5];
//
//        System.out.println("Give numbers to array 5x5:");
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                macierz[i][j] = sc.nextInt();
//            }
//        }
//
//        System.out.println("\nFirst macierz:");
//        printMacierz(macierz);
//
//        for (int j = 0; j < 5; j++) {
//            int temp = macierz[0][j];
//            macierz[0][j] = macierz[4][j];
//            macierz[4][j] = temp;
//        }
//
//        System.out.println("\nAfter switch first and last number in macierz:");
//        printMacierz(macierz);
//
//        for (int i = 0; i < 5; i++) {
//            int temp = macierz[i][i];
//            macierz[i][i] = macierz[i][4 - i];
//            macierz[i][4 - i] = temp;
//        }
//
//        System.out.println("\nAfter switch diagonal:");
//        printMacierz(macierz);
//    }
//
//    public static void printMacierz(int[][] macierz) {
//        for (int i = 0; i < macierz.length; i++) {
//            for (int j = 0; j < macierz[i].length; j++) {
//                System.out.printf("%4d", macierz[i][j]);
//            }
//            System.out.println();
//        }

        // Task 21 ***

        Scanner sc = new Scanner(System.in);

        System.out.println("Give sentence:");
        String sentence = sc.nextLine();

        String otherSentence = sentence.replaceAll("\\s+", "").toLowerCase();

        boolean palindrom = true;
        int n = otherSentence.length();
        for (int i = 0; i < n / 2; i++) {
            if (otherSentence.charAt(i) != otherSentence.charAt(n - 1 - i)) {
                palindrom = false;
                break;
            }
        }

        if (palindrom) {
            System.out.println("Sentence is a palindrom");
        } else {
            System.out.println("Sentence is not a palindrom");
        }
    }
}
