package composite;

public class Näytönohjain implements Laiteosa {
    private int hinta = 120;

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
