package Eksame1semester;



public class Task7 {
    static void checkEligibility(int stuage, int stuweight) {
        if (stuage < 12 && stuweight < 40) {
            throw new ArithmeticException("student is not eligible for registration");
        } else {
            System.out.println("student entry is valid");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the registration process");
        checkEligibility(10,39);
        System.out.println("Have a nice day");


        }
    }
