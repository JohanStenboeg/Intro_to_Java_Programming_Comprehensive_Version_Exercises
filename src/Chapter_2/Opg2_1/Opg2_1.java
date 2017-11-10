package Chapter_2.Opg2_1;
/*
        Program function:
        Converting miles to kilometre
        Author: Johan Stenbøg
        Reason:
        Homework during education.

        Country: Denmark
        */


import java.util.Scanner;

public class Opg2_1 {
    public static void main(String[] args) {
        //Importing Scanner class and making a new Scanner object.
        Scanner input = new Scanner(System.in);
        //Printing usertask.
        System.out.print("Enter miles: ");
        //Making the userinput equal to the user desired number input from console.
        double userinput = input.nextDouble();
        //Converting the miles to kilometre and deklareing it to a variable.
        double result = userinput * 1.6;
        //Printing out the result.
        System.out.println(userinput + " miles is " + result + " kilometres");
    }
}
