import java.util.Scanner;

public class Prac19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Reading the dimensions of the matrices
        System.out.print("Enter the number of rows and columns of the matrices: ");
        int rows = input.nextInt();
        int cols = input.nextInt();

        // Creating the matrices with the given dimensions
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] result = new int[rows][cols];

        // Reading the elements of matrix1
        System.out.println("Enter the elements of matrix1:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }

        // Reading the elements of matrix2
        System.out.println("Enter the elements of matrix2:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }

        // Adding the two matrices and storing the result in result matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Displaying the result matrix
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        input.close(); // Closing the scanner
    }
}
