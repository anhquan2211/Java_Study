package exercise02_magic_square;

import java.util.Arrays;

public class MatrixUtils {
    // Hàm in ma trận ra màn hình
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
