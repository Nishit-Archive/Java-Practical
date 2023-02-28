//WAP that prompts the user to enter a letter and check whether a letter is a vowel or   consonants.

import java.util.Scanner;

public class Practical6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Ch:");
        char ch = input.next().charAt(0);
        if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch ==
                'u' || ch == 'A'|| ch == 'E'|| ch == 'I' ||ch == 'O' ||ch
                == 'U'){
            System.out.println("Given char is vowel");
        }
else {
            System.out.println("Given Char is  consonants.");
        }




    }



}
