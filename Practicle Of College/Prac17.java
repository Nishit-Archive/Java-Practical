import java.util.Arrays;

public class Prac17 {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];

        // Fill matrix with random 0's and 1's
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
            }
        }

        // Display matrix
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        // Check rows have odd number of 1's
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count % 2 == 0) {
                System.out.println("Row " + i + " does not have an odd number of 1's");
            }
        }

        // Check columns have odd number of 1's
        for (int j = 0; j < matrix[0].length; j++) {
            int count = 0;
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            if (count % 2 == 0) {
                System.out.println("Column " + j + " does not have an odd number of 1's");
            }
        }
    }
}
