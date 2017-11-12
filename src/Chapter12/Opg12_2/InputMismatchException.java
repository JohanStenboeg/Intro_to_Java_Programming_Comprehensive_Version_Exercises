package Chapter12.Opg12_2;
/*
        Program funtion:
        Writing a program that when encountering an error is able to move on instead of crashing.
        In this program a input mismatch, where it has to be an integer.
        Author: Johan Stenbøg
        Reason: Homework during education.
        Due date: 26/10 2017
        Country: Denmark
        */

import java.util.Random; //Imports the random class
import java.util.Scanner; //Imports the scanner class

public class InputMismatchException {
    public static void main(String[] args) {
        Random random = new Random(); //Making a new random object.
        int userAnswer = 1; //Making a variable for the sum of the numbers.
        int rn1 = random.nextInt(10 - 1 + 1) + 1; //Setting up the first random number, to be a number between 1 and 10.
        int rn2 = random.nextInt(10 - 1 + 1) + 1;// Setting up the 2nd random number, also to be a number between 1 and 10.
        int result = rn1 + rn2;

        while (userAnswer != result) {
            Scanner input = new Scanner(System.in); //Making a scanner object.
            try { //setting up a try/catch funktion.
                //The user has to input an input which has to be an integer.
                System.out.println("What is the sum of " + rn1 + " and " + rn2 + "?");

                userAnswer = input.nextInt();
                //if not this will "catch" it and it will print out the following line.

            } catch (java.util.InputMismatchException ex) {
                System.out.println("Try again. The input has to be an integer");
            }
            if (result != userAnswer){
                System.out.println("The input was not correct, please try again");
            } else{
                System.out.println("The answer is correct. Good job!");
            }

        }
    }
}

