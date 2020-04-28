package prototype;

public class Main {

    public static void main(String[] args) {
        Clock clock = new Clock(new Second(10), new Minute(55), new Hour(11));
        System.out.println(clock);
        Clock clockClone = null;
        try {
            clockClone = (Clock) clock.clone();
            clockClone.getMinute().setM(12);
            clockClone.setSecond(new Second(44));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(clock);
        System.out.println(clockClone);

    }
}
