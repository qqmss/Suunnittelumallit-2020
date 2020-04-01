package decorator;

public class ConcreteText implements Text {
    private static final String TEXT = "tämä on data-rakenteen sisältö";

    @Override
    public void print() {
        System.out.println(TEXT);
    }
}
