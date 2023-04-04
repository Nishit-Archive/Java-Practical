import java.util.Random;

public class Pra12 {
    public static void main(String[] args) {
        Random rand = new Random();

        String plateNumber = "";

        // Generate three uppercase letters
        for (int i = 0; i < 3; i++) {
            char letter = (char) (rand.nextInt(26) + 'A');
            plateNumber += letter;
        }

        // Generate four digits
        for (int i = 0; i < 4; i++) {
            int digit = rand.nextInt(10);
            plateNumber += digit;
        }

        System.out.println("Generated plate number: " + plateNumber);
    }
}
//Explanation:
//
//        We first import the Random class from the java.util package.
//
//        We create a new Random object called rand.
//
//        We initialize an empty String called plateNumber, which will be used to store the generated plate number.
//
//        We use a for loop to generate three uppercase letters. For each iteration of the loop, we generate a random integer between 0 and 25 using the nextInt(26) method on the rand object. We then add the ASCII value of 'A' (which is 65) to this integer to get a random uppercase letter. We cast this integer to a char and add it to the plateNumber String.
//
//        We use another for loop to generate four digits. For each iteration of the loop, we generate a random integer between 0 and 9 using the nextInt(10) method on the rand object. We add this integer to the plateNumber String.
//
//        Finally, we print the generated plate number to the console using the System.out.println() method.