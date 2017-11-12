package Chapter3.Opg3_17;
/*
Program function:
Rock/Paper/Scissor game working in console.
Author:
Johan Stenbøg
Reason:
Homework during education.
Country:
Denmark
*/


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Making a scanner object.

        //Giving instructions to the user.
        System.out.print("Enter your choice. Scissor(0), Rock(1), Paper(2): ");
        //Declareing variable to userinput.
        int yourChoice = input.nextInt();

        Random randomNum = new Random(); //Deklarerer et nyt object
        //Making a random number generator to generate numbers between 0 and 2.
        int random = randomNum.nextInt(3); //Initialisere opbjektet.
        System.out.println(random);
        //Setting up all the different scenarios.
        if (random == yourChoice) {
            System.out.println("You and the computer both chose the same and its a draw.");
        } else if(random == 0 && yourChoice == 1){
            System.out.println("The computer is Scissor. You chose Rock. You win.");
        } else if(random == 1 && yourChoice == 2) {
            System.out.println("The computer is Rock. You chose Paper. You win.");
        } else if(random == 2 && yourChoice == 0) {
            System.out.println("The computer is Paper. You chose Scissor. You win.");
        } else if(random == 1 && yourChoice == 0) {
            System.out.println("The computer is Rock. You chose Scissor. You lose.");
        } else if(random == 2 && yourChoice == 1) {
            System.out.println("The computer is Paper. You chose Rock. You lose. ");
        } else if(random == 0 && yourChoice == 2){
            System.out.println("The computer is Scissor. You chose Paper. You lose.");
        }
    }
}
