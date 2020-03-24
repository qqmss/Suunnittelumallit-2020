package observer;

public class Main {

    public static void main(String[] args) {

        ClockTimer clockTimer = new ClockTimer();
        new Thread(clockTimer).start();
        new DigitalClock(clockTimer);
    }
}
