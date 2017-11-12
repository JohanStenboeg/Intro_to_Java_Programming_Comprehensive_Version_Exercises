package Chapter_2;

import java.util.Scanner;
/*
Program:Program which convertes a number of seconds decided by the user into minutes as long as the number is above 60.
The program exits if the user picks 0.
Org.: Easj Næstved
Date: 21/09 2017
Author: Johan Stenbøg
 */
public class DisplayTimeProject {
          public static void main(String[] args) {
            //Defines some variables for later use in the code.
            int secondsRemaining;
            int minutesRemainings = 0;
            int totalSeconds = 1;

            Scanner input = new Scanner(System.in); //Setting up a scanner.

            while (totalSeconds != 0) {
                System.out.print("Type in ammount of seconds you want converted to minutes and seconds(type 0 for exit): "); //Tells the user what to do.
                totalSeconds = input.nextInt(); //Sets a new value for totalSeconds
                if (totalSeconds < 60) {
                    System.out.println("The user-picked number has to be 60 or above or this program has no real function.  ");
                } else {

                    if (minutesRemainings <= 1) {
                        minutesRemainings = totalSeconds / 60; //Calculates amount of minutes first.
                        secondsRemaining = totalSeconds % 60; //Calculates remaining time into seconds.
                        System.out.println("Minute: " + minutesRemainings + " Second: " + secondsRemaining);
                    } else {
                        minutesRemainings = totalSeconds / 60; //Calculates amount of minutes first.
                        secondsRemaining = totalSeconds % 60; //Calculates remaining time into seconds.
                        System.out.println("Minutes " + minutesRemainings + " Seconds: " + secondsRemaining);
                    }
                }

            }

        }

    }
