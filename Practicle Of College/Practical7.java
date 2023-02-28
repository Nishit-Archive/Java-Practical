import java.util.Scanner;

public class Practical7 {
    public static void main(String[] args) {
        System.out.print("Enter input String:");    // This Line is not require
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int length = input.length();
        int halfLength = length / 2;

        System.out.println("Length of the input string is " + length);

        if (length % 2 == 0) {
            // If length is even, print second half
            System.out.println("Second half of the input string is: " + input.substring(halfLength));
        } else {
            // If length is odd, print from the middle character
            System.out.println("Second half of the input string is: " + input.substring(halfLength + 1));
        }
    }
}
