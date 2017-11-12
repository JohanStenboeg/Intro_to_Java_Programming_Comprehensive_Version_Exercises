package Chapter12.Opg12_3;
/*
Program: Displays the use of out of bounds exceptions.
Org.: Easj Næstved
Author: Johan Stenbøg
*/

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIndexOutOfBoundException{
    public static void main(String[] args) {
        //Making a new array with a size of 120.
    int[] numbers = new int[120];
    //Creating a for loop to fill the array with random numbers between 0 and 10.
        for (int i = 0; i < numbers.length ; i++) {
            numbers[i] = (int) (Math.random() * 10);
        }
        //Printing the array.
            System.out.println(Arrays.toString(numbers));

        try {
            //Asking the user to pick a number in the array to get the number on that place displayed.
            System.out.print("Write a number between 1 and 120 to see the number on that place in the array:");
            Scanner input = new Scanner(System.in); //Making a new scanner object.
            int userPickedNumber = input.nextInt(); //Declareing the userpickednumber to be the value from the scanner.
            System.out.println(numbers[userPickedNumber]); //Displaying the number on the picked place.
        } //If the desired number is above 120, an out of bounds exception occurs.
        catch(java.lang.ArrayIndexOutOfBoundsException ex) {
            //It is caught and instead of crashing it displays the following text.
            System.out.println("Out of Bounds");
        System.out.println("The number value has to be between 1 and 120");
    }
}
}
