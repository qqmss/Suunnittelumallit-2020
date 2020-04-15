package builder;

public class StringHamburgerBuilder implements HamburgerBuilder {
    private StringBuilder hamburger = new StringBuilder();

    @Override
    public void makeBun() {
        hamburger.append("bun ");
    }

    @Override
    public void makeSalad() {
        hamburger.append("salad ");
    }

    @Override
    public void makePatty() {
        hamburger.append("patty ");
    }

    public StringBuilder getBurger() {
        return hamburger;
    }
}
