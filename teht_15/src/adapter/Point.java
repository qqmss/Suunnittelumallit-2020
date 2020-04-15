package adapter;

public class Point implements Shape{
    private PolarPoint polarPoint;

    public Point(double x, double y) {
        this.polarPoint = new PolarPoint(Math.sqrt(x*x + y*y), Math.atan2(y, x));
    }

    public double getX() {
        return polarPoint.getR() * Math.cos(polarPoint.getAngle());
    }

    public void setX(int x) {
        double y = getY();
        this.polarPoint.setAngle(Math.atan2(y, x));
        this.polarPoint.setR(Math.sqrt(x*x + y*y));
    }

    public double getY() {
        return polarPoint.getR() * Math.sin(polarPoint.getAngle());
    }

    public void setY(int y) {
        double x = getX();
        this.polarPoint.setAngle(Math.atan2(y, x));
        this.polarPoint.setR(Math.sqrt(x*x + y*y));
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + ")";
    }
}
