package observer;

import java.time.LocalTime;
import java.util.Observable;

public class ClockTimer extends Observable implements Runnable {

    private int secondOfTheDay;

    public ClockTimer() {
        this.secondOfTheDay = LocalTime.now().toSecondOfDay();
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tick();
        }
    }

    private void tick() {
        secondOfTheDay++;
        if (secondOfTheDay >= 86400) {
            secondOfTheDay = 0;
        }
        setChanged();
        notifyObservers();
    }

    public int getSecond() {
        return secondOfTheDay % 60;
    }

    public int getMinute() {
        return secondOfTheDay / 60 % 60;
    }

    public int getHour() {
        return secondOfTheDay / (60 * 60);
    }

}
