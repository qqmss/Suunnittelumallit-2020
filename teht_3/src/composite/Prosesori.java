package composite;

public class Prosesori implements Laiteosa {
    private int hinta = 80;

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
