
public class Main {

    public static void main(String[] args) {
        int[][] matrix = {{2, 3, 4}, {5, 6, 4}};
        int[][] tMatrix = new int[matrix[0].length][matrix.length];
        System.out.println("Matris : ");
        printMatrix(matrix);
        transpose(matrix,tMatrix);
        System.out.println("Matrisin Transpozu : ");
        printMatrix(tMatrix);
    }

    static void transpose(int matrix[][],int tMatrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                tMatrix[j][i] = matrix[i][j];
            }
        }
    }

    static void printMatrix(int matrix[][]) {
        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + "  ");
            }
            System.out.println();
        }
    }
}
