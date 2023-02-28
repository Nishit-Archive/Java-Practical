import java.util.Scanner;

//WAP that reads a number in meters, converts it to feet, and displays the result.
public class Practical4 {
    public static void main(String[] args) {
        System.out.print("Enter the value of meter:");
        Scanner input = new Scanner(System.in);
        Double meter = input.nextDouble();
        Double  feet = meter * 3.28084;
        System.out.println("Feet: " + feet);

    }

}
