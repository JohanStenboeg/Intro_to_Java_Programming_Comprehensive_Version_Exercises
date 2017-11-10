package Chapter10.Opg10_4;

public class MyPoint {

    private double x = 0;
    private double y = 0;
    private String pointName;

    public MyPoint(String pointName, double x, double y){
        this.pointName = pointName;
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public String getPointName(){return pointName;}

    public double getDistanceBetweenPoints(double x1, double y1, double x2, double y2){
        double distance = (Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1))));
        return distance;
    }
}

