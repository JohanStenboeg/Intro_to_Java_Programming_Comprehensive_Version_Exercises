package Eksame1semester.Task9;

public class Person implements Info {
    private String name;

    public Person(String name) {
        this.name = name;
    }
    public void greet(){
        System.out.println("Greetings friend");
    }

    @Override
    public void showInfo() {
        System.out.println("Person name is: " + name);
    }
}
