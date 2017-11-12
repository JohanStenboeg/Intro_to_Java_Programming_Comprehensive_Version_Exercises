package Chapter5;

/*
Program function:
A program that in a for loop generates 10 numbers and multiplies them by 2.54 to convert them to centimetres. 
Author:
Johan Stenbøg
Reason:
Homework during education.
Country:
Denmark
*/

public class Opg5_4 {
    public static void main(String[] args) {

        double i; //Deklarerer variablen

        System.out.println("Inches" + "   Centimetres"); //Indsætter noget beskrivende tekst.

        for (i = 0; i <= 10; i++) { //Opsætter et for loop der går fra 0 til 10 og ligger 1 til hver gang det kører.

            System.out.print(i + "      " + (i * 2.54)); //Printer først værdien af i og så i ganget med 2.54.

            System.out.println(""); //Printer en ny linje mellem hver input, så det står under hinanden og ikke efter.
        }
    }

}
