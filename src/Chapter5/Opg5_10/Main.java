package Chapter5.Opg5_10;
/*
Program function:
A program that makes numbers between 100 and 1000 and shows all numbers between those that are dividable by 3 and 4.
Author:
Johan Stenbøg
Reason:
Homework during education.
Country:
Denmark
*/

public class Main {
    public static void main(String[] args) {
        int i; //Declaring a variable.'
        //Setting up a for loop.
        for (i = 100; i <= 1000; i++) {
            //If the numbers are dividable by either 3 or 4, displays them.
            if (i % 3 == 0 && i % 4 == 0) {

                System.out.print(i + "\n ");
            }
        }
    }

}
