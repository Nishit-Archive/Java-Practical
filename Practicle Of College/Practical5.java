import java.util.Scanner;

public class Practical5 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1  = input.nextInt();
        System.out.println("Enter second number:");
        int num2  = input.nextInt();
        System.out.println("Enter Third number:");
        int num3  = input.nextInt();


        int max =  num1;
        if(num2 > max){
           max =num2;
        }
        if (num3 > max){
            max =num3;

        }
        System.out.println("Biggest int number is:" + max);
    }



}
