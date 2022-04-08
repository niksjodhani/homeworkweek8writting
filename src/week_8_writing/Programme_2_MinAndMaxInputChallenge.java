package week_8_writing;

import java.util.Scanner;

/**
 * Read the number From the console entered by the user and print the minimum and number
 * the user has entered.
 * before the user entered rhe number,print the messege Enter number:
 * If the user enters an invalid number, Break out of the loop and print the minimum and maximum number.
 * Hint :
 * Use an endless whileloop.
 * Create a class with the name MinAndMaxInputChallenge.
 */


public class Programme_2_MinAndMaxInputChallenge{
    public static void findMinAndMaxNumber(){
        //Scanner Declaration for Reading input from consol
        Scanner scanner=new Scanner(System.in);
        int min=0;
        int max=0;
        boolean first=true;
        //while loop.
        while (true){
            System.out.println("Enter Number: ");
            boolean isAnInt =scanner.hasNextInt();
            if(isAnInt){
                int number = scanner.nextInt();
                if (first){
                    first=false;
                    min=number;
                    max=number;
                }if (number>max){
                    max=number;
                }
                if (number<min){
                    min=number;
                }
            }else {
                break;
            }

            scanner.nextLine();//handle input
        }
        System.out.println("min = "+min+" ,max = "+max);
        scanner.close();
    }

    public static void main(String[] args) {
        findMinAndMaxNumber();
    }
}
