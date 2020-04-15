package builder;

public class Main {

    public static void main(String[] args) {
        SimpleHamburgerBuilder simpleHamburgerBuilder = new SimpleHamburgerBuilder();
        StringHamburgerBuilder stringHamburgerBuilder = new StringHamburgerBuilder();

        BurgerDirector burgerDirector = new BurgerDirector(simpleHamburgerBuilder);
        burgerDirector.makeBurger();
        System.out.println(simpleHamburgerBuilder.getBurger());

        burgerDirector = new BurgerDirector(stringHamburgerBuilder);
        burgerDirector.makeBurger();
        System.out.println(stringHamburgerBuilder.getBurger());
    }
}
