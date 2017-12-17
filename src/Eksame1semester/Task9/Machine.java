package Eksame1semester.Task9;

public class Machine implements Info {
    private int id = 7;

    public void start() {
        System.out.println("Machine started");

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void showInfo() {
        System.out.println("Machine Id is" + id);
    }
}

