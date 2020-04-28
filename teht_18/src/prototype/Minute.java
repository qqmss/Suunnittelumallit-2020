package prototype;

public class Minute implements Cloneable{
    private int m;

    public Minute(int m) {
        this.m = m;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
