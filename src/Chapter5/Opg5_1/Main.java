package Chapter5.Opg5_1;
/*
Program function:
A simple program where the user enters their exam result. If the number is above 60 they passed the exam.
Author:
Johan Stenbøg
Reason:
Homework during education.
Country:
Denmark
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Deklarerer scanneren.

        int yourScore = -10; //Sætter yourScore til et tal den aldrig bliver, så den er defineret.

        while (yourScore !=-1){ //Opsætter et while loop. Loopet kører så længe input ikke er -1. Så taster man -1, stopper programmet.

            System.out.print("Enter your score: "); //Printer en beskrivende tekst til hvad man skal.

            yourScore = input.nextInt(); //Deklarerer at yourScore får sin værdi fra scannerinput.

            if (yourScore<60) { //Hvis scoren er under 60 består man ikke.
                System.out.println("You did not pass the exam");

            }else if (yourScore>=60) { //Hvis scoren er over eller 60, så består man.
                System.out.println("You passed the exam");
            }
        }
    }
}
