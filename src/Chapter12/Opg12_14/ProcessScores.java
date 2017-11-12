package Chapter12.Opg12_14;

/*
Program: Creates a textfile then writes some numbers to the file and then reads the numbers and finding the average and total score.
Org.: Easj Næstved
Author: Johan Stenbøg
*/

//Imports classes.

import java.io.*;
import java.util.Scanner;

public class ProcessScores {
    public static void main(String[] args) throws Exception {
        //Creates a new file named scores, format txt.
        File file = new File("scores.txt");
        //Making an array named numbers with a size of 10.
        int[] numbers = new int[10];
        //If the file already exists, it delets the file before creating a new.
        if (file.exists()) {
            file.delete();
            File file1 = new File("scores.txt");
        //Making a try where it tries to print to the file
        }
        try (
                PrintWriter output = new PrintWriter(file);

        ) {
            //The numbers it tries to write in the file.
            output.println(1);
            output.println(2);
            output.println(3);
            output.println(4);
            output.println(5);
            output.println(6);
            output.println(7);
            output.println(8);
            output.println(9);
            output.println(10);

        }
        //Setting up a scanner to read from the file.
        Scanner input = new Scanner(new File("scores.txt"));
        while(input.hasNext()) {
            int value1 = input.nextInt(); //Declareing the numbers in the file to valuenumbers.
            int value2 = input.nextInt();
            int value3 = input.nextInt();
            int value4 = input.nextInt();
            int value5 = input.nextInt();
            int value6 = input.nextInt();
            int value7 = input.nextInt();
            int value8 = input.nextInt();
            int value9 = input.nextInt();
            int value10 = input.nextInt();
            //Finding the total value
            int totalValue = (value1 + value2 + value3 + value4 + value5 + value6 + value7 + value8 + value9 + value10);
            //Finding the average value.
            int averageValue = ((value1 + value2 + value3 + value4 + value5 + value6 + value7 + value8 + value9 + value10)/10);
            //Printing out the total and average.
            System.out.println("Total value of the numbers in the file is: " + totalValue);
            System.out.println("Average value of the numbers in the file is: " + averageValue);
        }
        //Closing the window.
        input.close();
    }

}
