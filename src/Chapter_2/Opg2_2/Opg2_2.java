package Chapter_2.Opg2_2;
/*
        Program function:
        Compute the volume of a triangle
        Author: Johan Stenbøg
        Reason:
        Homework during education.

        Country: Denmark
        */
import java.util.Scanner;

public class Opg2_2 {
    public static void main(String[] args) {
        //Importing Scanner and making a new scanner object.
        Scanner input = new Scanner(System.in);
        //Telling the user what to do
        System.out.print("Enter side lenght of the triangle: ");
        //Making the side equal to the userdesired input.
        double sideLenght = input.nextDouble();
        //Doing the math for the area
        double circleArea = (((Math.sqrt(3))/4)*(sideLenght*sideLenght));
        //Doing the match for the volume
        double circleVolume = (circleArea * sideLenght);
        //Printing the area and volume in 2 lines.
        System.out.println("The area is " + circleArea);
        System.out.println("The volume is " + circleVolume);
        System.out.println(Math.pow((6*12+3),2));
    }
}
