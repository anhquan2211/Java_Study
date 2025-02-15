package exercise02_magic_square;

public class Main {
    public static void main(String[] args) {
        // Ma trận đầu vào cần chuyển đổi
        int[][] inputMatrix = {
                {5, 3, 4},
                {1, 5, 8},
                {6, 4, 2}
        };

        // Sử dụng interface để đảm bảo tính mở rộng
        IMagicSquareConverter converter = new MagicSquareConverter();

        System.out.println("Ma trận ban đầu:");
        MatrixUtils.printMatrix(inputMatrix);

        int[][] magicSquare = converter.convertToMagicSquare(inputMatrix);

        System.out.println("Ma trận Magic Square tối ưu:");
        MatrixUtils.printMatrix(magicSquare);
    }
}
