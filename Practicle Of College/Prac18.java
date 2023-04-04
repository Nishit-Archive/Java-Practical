import java.util.Arrays;
import java.util.Scanner;

public class Prac18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Reading the size of the array
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        // Creating the array with the given size
        int[] arr = new int[size];

        // Reading the elements of the array
        System.out.print("Enter " + size + " integers: ");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        // Sorting the array in ascending order
        Arrays.sort(arr);

        // Displaying the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        input.close(); // Closing the scanner
    }
}
