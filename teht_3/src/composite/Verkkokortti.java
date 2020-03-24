package composite;

public class Verkkokortti implements Laiteosa {
    private int hinta = 35;

    @Override
    public int getHinta() {
        return hinta;
    }

    @Override
    public int laskeYhteishinta() {
        return getHinta();
    }

    @Override
    public void addOsa(Laiteosa lisättäväLaiteosa) {
        throw new RuntimeException("Lehtiosiin ei voi lisätä osia");
    }
}
