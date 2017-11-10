package Chapter10.Opg10_2;

public class BMI {
    //Declaring variables
    private String name;
    private int age;
    private double weight; //In kg
    private double height; //in meter
    private double feet;
    private double weightPound;
    private double inches;

    //Making a constructor for european measurements.
    public BMI(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    //Making another constructor for american measurements.
    public BMI(String name, int age, double weightPound, double feet, double inches) {
        this.name = name;
        this.age = age;
        this.feet = feet;
        this.weightPound = weightPound;
        this.inches = inches;
    }

    //Making a method for getting bmi from the european measurements.
    public double getBMI() {
        double bmi = (weight / ((height * height)));
        return bmi;
    }

    //Making a method for getting bmi from the american measurements.
    public double getBMIA() {
        //Using Math.pow to multiply the number by itself 2 times.
        double bmi = ((weightPound / ((Math.pow((feet * 12 + inches), 2))) * 703));
        return bmi;
    }

    //Making a method for getting status of bmi for the european way.
    public String getStatus() {
        double bmi = getBMI();
        if (bmi < 18.5)
            return "Underweight"; //If result is less than 18.5, write underweight
        else if (bmi < 25)
            return "Normal"; //if result is less than 25, write normal.
        else if (bmi < 30)
            return "Overweigth"; //If result is less than 30, write overweight.
        else
            return "Obese"; //If result more than 30, write obese.
    }

    //Getting some problems with dublicate code here, even tho its different..
    //A method for getting the bmi status for the american way.
    public String getStatusA() {
        double bmiA = getBMIA();
        if (bmiA < 18.5)
            return "Underweight"; //If result is less than 18.5, write underweight
        else if (bmiA < 25)
            return "Normal"; //if result is less than 25, write normal.
        else if (bmiA < 30)
            return "Overweigth"; //If result is less than 30, write overweight.
        else
            return "Obese"; //If result more than 30, write obese.
    }

    //Getters for age and name.
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
