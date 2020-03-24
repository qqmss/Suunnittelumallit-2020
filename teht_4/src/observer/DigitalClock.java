package observer;

import java.util.Observable;
import java.util.Observer;

public class DigitalClock implements Observer {

    private ClockTimer timer;

    public DigitalClock(ClockTimer timer) {
        this.timer = timer;
        this.timer.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object o) {
        if (observable == timer) {
            draw();
        }
    }

    public void draw() {
        System.out.println(timer.getHour() + ":" + String.format("%02d", timer.getMinute()) + ":" + String.format("%02d", timer.getSecond()));
    }
}
