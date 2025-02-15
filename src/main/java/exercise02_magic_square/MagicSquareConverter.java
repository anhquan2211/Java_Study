package exercise02_magic_square;

import java.util.Arrays;

public class MagicSquareConverter implements IMagicSquareConverter {
    // Danh sách tất cả các ma trận Magic Square hợp lệ
    private static final int[][][] MAGIC_SQUARES = {
            {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
            {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
            {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
            {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
            {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
            {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
            {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
            {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}}
    };

    // Hàm tính chi phí chuyển đổi giữa hai ma trận
    private int calculateCost(int[][] matrix, int[][] magicSquare) {
        int cost = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cost += Math.abs(matrix[i][j] - magicSquare[i][j]);
            }
        }
        return cost;
    }

    // Hàm tìm ma trận Magic Square tối ưu với chi phí thấp nhất
    @Override
    public int[][] convertToMagicSquare(int[][] matrix) {
        int minCost = Integer.MAX_VALUE;
        int[][] bestMagicSquare = new int[3][3];

        for (int[][] magicSquare : MAGIC_SQUARES) {
            int cost = calculateCost(matrix, magicSquare);
            if (cost < minCost) {
                minCost = cost;
                bestMagicSquare = magicSquare;
            }
        }

        System.out.println("Chi phí tối thiểu: " + minCost);
        return bestMagicSquare;
    }
}


