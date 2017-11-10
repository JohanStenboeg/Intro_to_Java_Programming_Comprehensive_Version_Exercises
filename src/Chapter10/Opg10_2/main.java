package Chapter10.Opg10_2;

public class main {
    public static void main(String[] args) {
        //Using the old constructor.
        BMI bmi1 = new BMI("John Cena 2nd", 80, 1.80);
        System.out.println("Name: " + bmi1.getName() + " BMI: " + bmi1.getBMI() + " Status: " + bmi1.getStatus());

        //Using the new constructor.
        BMI bmi2 = new BMI("John Cena", 5, 180, 6, 3);
        System.out.println("Name: " + bmi2.getName() + " Age: " + bmi2.getAge() + " BMI: " + bmi2.getBMIA() + " Status: " + bmi2.getStatusA());
    }
}
