package Eksame1semester;

public class Task1 {
    byte b1 = 100, b2 = -50;
    short s1 = 32, s2 = -42;
    int i1 = 2000, i2 = -3000;
    long l1 = 10000, l2 = -40000;
    float f1 = 234.5f;
    double d1 = 234.5;
    boolean bo1 = true;
    boolean bo2 = false;
    char letterA = 'A';
    String sentence = "Hello, this is a sentence";


//Instance variable
    public String bossName = "Erik";
//Local variable, Limited to only this method.
    public void pupAge() {
        int age = 0;
        age = age + 7;
        System.out.println("Puppy age is :" + age);
    }





    public static void main(String[] args) {
        //Typecasting
        double myDouble = 12.4;
        int myInt = (int)myDouble;


        Task1 pupAgeTest = new Task1();
        pupAgeTest.pupAge();
        System.out.println(pupAgeTest.bossName);

        System.out.println(myDouble);
        System.out.println(myInt);
    }


    }
