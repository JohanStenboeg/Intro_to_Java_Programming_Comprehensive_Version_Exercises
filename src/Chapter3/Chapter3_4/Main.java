package Chapter3.Chapter3_4;
/*
Program function:
Program that generates a random number between 1 and 12 and then displays the corresponding month.
Author:
Johan Stenbøg
Reason:
Homework during education.
Country:
Denmark
*/

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random(); //Deklarerer et nyt object

        int randomInt = random.nextInt(12)+1; //Initialisere opbjektet.

        int month = randomInt; //Sætter værdien fra random til at være det samme som month.

        if (month == 1) {
            System.out.println("January"); //Laver 12 if sætninger, som hvis den er fx. 1, så er det January osv. Hvilken det så også skriver ud.
        }
        else if (month == 2) {
            System.out.println("February ");
        }
        else if (month == 3) {
            System.out.println("March");
        }
        else if (month == 4) {
            System.out.println("April");
        }
        else if (month == 5) {
            System.out.println("May");
        }
        else if (month == 6) {
            System.out.println("June");
        }
        else if (month == 7) {
            System.out.println("July");
        }
        else if (month == 8) {
            System.out.println("August");
        }
        else if (month == 9) {
            System.out.println("September");
        }
        else if (month == 10) {
            System.out.println("October");
        }
        else if (month == 11) {
            System.out.println("November");
        }
        else if (month == 12) {
            System.out.println("December");
        }
    }
}
