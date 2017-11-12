package Chapter3.Opg3_6;
/*
Program function:
A simple DMI calculator.
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

        Scanner input = new Scanner(System.in); //Definere scanneren.

        System.out.print("Enter weight in kg: "); //Skriver en beskrivende tekst til hvilket input man skal give scanneren.

        int totalWeightOfHuman = input.nextInt(); //Definere en variabel til scanneren.

        System.out.println("Enter Height in m: "); //Skriver en beskrivende tekst til nr. 2 input til scannerne.

        double totalHeightOfHuman = input.nextDouble(); //Definere variablen totalheightofhuman.

        double BMI = (totalWeightOfHuman / (totalHeightOfHuman * totalHeightOfHuman)); //Skriver formlen for BMI, som systemet skal bruge.

        System.out.println("BMI of person with a weight of: " + totalWeightOfHuman + " and total height of: " + totalHeightOfHuman + " is: " + BMI); //Udprinter de resultater man har skrevet i scanner samt BMI.

        if (BMI < 18.5) {
            System.out.println("Underweight"); //Hvis resultatet er under 18.5 skriver den underweight.
        } else if (BMI < 25) {
            System.out.println("Normal"); //Hvis resultatet er under 25, skriver den normal.
        } else if (BMI < 30) {
            System.out.println("Overweight"); //Hvis den er under 30, skriver den overweight.
        } else {
            System.out.println("Obese"); //Hvis den er over 30, skriver den Obese.
        }

    }
}
