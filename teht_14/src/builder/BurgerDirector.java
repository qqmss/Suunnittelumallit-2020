package builder;

public class BurgerDirector {
    private HamburgerBuilder builder;

    public BurgerDirector(HamburgerBuilder builder) {
        this.builder = builder;
    }

    public void makeBurger(){
        builder.makeBun();
        builder.makePatty();
        builder.makeSalad();
    }
}
