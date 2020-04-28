package prototype;

public class Clock implements Cloneable{
    private Second second;
    private Minute minute;
    private Hour hour;

    public Clock(Second second, Minute minute, Hour hour) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public Second getSecond() {
        return second;
    }

    public Minute getMinute() {
        return minute;
    }

    public Hour getHour() {
        return hour;
    }

    public void setSecond(Second second) {
        this.second = second;
    }

    public void setMinute(Minute minute) {
        this.minute = minute;
    }

    public void setHour(Hour hour) {
        this.hour = hour;
    }


    @Override
    public String toString() {
        return hour.getH() + ":" + minute.getM() + ":" +second.getS();
    }


    @Override
    public Object clone() throws CloneNotSupportedException {
        Clock clock = (Clock) super.clone();
        clock.setHour((Hour) hour.clone());
        clock.setMinute((Minute) minute.clone());
        clock.second = (Second) second.clone();
        return super.clone();
    }
}
