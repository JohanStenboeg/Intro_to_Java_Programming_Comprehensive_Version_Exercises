package Chapter10.Opg10_4;

public class Main {
    public static void main(String[] args) {
        //Creating a new point object from the constructor in MyPoint.
        MyPoint point1 = new MyPoint("Point 1", 0, 0);
        MyPoint point2 = new MyPoint("Point 2", 0, 0);
        //As the koordinates are already correkt there is no need for setting them.
        //Printing out the names and coordinates for the point.
        System.out.println("Koordinater for " + point1.getPointName() + " er: " + point1.getX() + "," + point1.getY());

        //Setting the new coordinates to the point2 object.
        point2.setX(10);
        point2.setY(30.5);
        //Printing out the coordinates and name for point2.
        System.out.println("Koordinater for " + point2.getPointName() + " er: " + point2.getX() + "," + point2.getY());
        //Printing out the name of the points and the difference between them, calling the getDistanceBetweenPoints method.
        System.out.println("Distancen mellem " + point1.getPointName() + " og " + point2.getPointName() + " er: " + point1.getDistanceBetweenPoints(0,0, 10, 30.5));

    }
}
