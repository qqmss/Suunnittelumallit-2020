package builder;

import java.util.ArrayList;
import java.util.List;

public class SimpleHamburgerBuilder implements HamburgerBuilder {
    private List<HamburgerPart> parts = new ArrayList<>();

    @Override
    public void makeBun() {
        parts.add(new Bun());
    }

    @Override
    public void makeSalad() {
        parts.add(new Salad());
    }

    @Override
    public void makePatty() {
        parts.add(new Patty());
    }

    public List<HamburgerPart> getBurger() {
        return parts;
    }
}
