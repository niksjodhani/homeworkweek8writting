package week_8_writing;

import java.util.Scanner;

/**
 * Write a Java [rogarm that takes the user to provide a single character from the
 * alphabet.print Vowel of Consonant,depending on the user input.if the user input
 * Is not a letter(between a and z  or A to Z), or is a string of length >1,print an error message.
 */
public class Programme_3_FindVowelOrConsonant {
    public static void checkVowelOrConsonat(String letter) {
        //check length of String
        //if user enter more then 1 character an error message is printed
        if (letter.length() > 1) {
            System.out.println("error.not single character");
            //if user enter a symbol

        } else if (!(isItALetter(letter))) {
            System.out.println("Error. Not a letter. Enter uppercase or lowercase letter");
        } else if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o")
                || letter.equals("u")) {
            System.out.println("Input letter is a vowel");
        } else {
            System.out.println("Input letter is a consonant");
        }
    }


    //This method will check is it a letter or not?
    public static boolean isItALetter(String l) {
        return l.charAt(0) > 96 && l.charAt(0) < 123;
    }

    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any character : ");
        String str = scanner.next().toLowerCase();
        //calling static method directly
        checkVowelOrConsonat(str);
        // closing scanner
        scanner.close();

    }
}
