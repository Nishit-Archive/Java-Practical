import java.util.Scanner;

public class Pra13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a decimal number
        System.out.print("Enter a decimal number: ");
        String decimalStr = input.nextLine();

        // Extract the integer part and fractional part from the input
        int integerPart = Integer.parseInt(decimalStr.split("\\.")[0]);
        String fractionalStr = decimalStr.split("\\.")[1];
        int fractionalPart = Integer.parseInt(fractionalStr);

        // Calculate the denominator
        int denominator = (int) Math.pow(10, fractionalStr.length());

        // Simplify the fraction
        int gcd = findGCD(fractionalPart, denominator);
        fractionalPart /= gcd;
        denominator /= gcd;

        // Display the fraction
        System.out.println("The fraction is " + integerPart + " " + fractionalPart + "/" + denominator);
    }

    // Function to find the greatest common divisor using Euclid's algorithm
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }
}
