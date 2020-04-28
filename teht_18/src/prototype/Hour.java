package prototype;

public class Hour implements Cloneable{
    private int h;

    public Hour(int h) {
        this.h = h;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
