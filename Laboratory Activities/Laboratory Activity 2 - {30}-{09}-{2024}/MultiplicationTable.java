import java.util.Scanner;

// Function to get size and the multiplication/loop of the table
public class MultiplicationTable {
    public static int[][] getTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the multiplication table: ");
        int size = scanner.nextInt();

        int[][] table = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        scanner.close();
        return table;
    }
//just a function to print the table
    public static void printMultiplicationTable(int[][] table, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%4d", table[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] table = getTable();
        int size = table.length;
        System.out.println("\nMultiplication Table:");
        printMultiplicationTable(table, size);

    }
}