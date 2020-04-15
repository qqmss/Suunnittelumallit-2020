package adapter;

public class PolarPoint {
    private double r, angle;

    public PolarPoint(double r, double angle) {
        this.r = r;
        this.angle = angle;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }
}
