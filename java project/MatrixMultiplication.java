import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows for the first matrix: ");
        int rows1 = input.nextInt();

        System.out.print("Enter the number of columns for the first matrix: ");
        int columns1 = input.nextInt();

        System.out.print("Enter the number of rows for the second matrix: ");
        int rows2 = input.nextInt();

        System.out.print("Enter the number of columns for the second matrix: ");
        int columns2 = input.nextInt();

        if (columns1 != rows2) {
            System.out.println("Matrix multiplication is not possible!");
            input.close();
            return;
        }

        int[][] matrix1 = new int[rows1][columns1];
        int[][] matrix2 = new int[rows2][columns2];

        System.out.println("Enter elements of the first matrix:");
        fillMatrix(matrix1, input);

        System.out.println("Enter elements of the second matrix:");
        fillMatrix(matrix2, input);

        int[][] resultMatrix = multiplyMatrices(matrix1, matrix2);

        System.out.println("\nResultant matrix after multiplication:");
        printMatrix(resultMatrix);

        input.close();
    }

    public static void fillMatrix(int[][] matrix, Scanner input) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextInt();
            }
        }
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int columns1 = matrix1[0].length;
        int columns2 = matrix2[0].length;

        int[][] resultMatrix = new int[rows1][columns2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < columns2; j++) {
                for (int k = 0; k < columns1; k++) {
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return resultMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
