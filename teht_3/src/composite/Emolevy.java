package composite;

import java.util.ArrayList;
import java.util.List;

public class Emolevy implements Laiteosa {
    private int hinta = 50;
    private List<Laiteosa> osaLista = new ArrayList<Laiteosa>();

    @Override
    public int getHinta() {
        return hinta;
    }

    @Override
    public int laskeYhteishinta() {
        int yhteishinta = hinta;
        for (Laiteosa osa : osaLista) {
            yhteishinta += osa.laskeYhteishinta();
        }
        return yhteishinta;
    }

    @Override
    public void addOsa(Laiteosa lisättäväLaiteosa) {
        osaLista.add(lisättäväLaiteosa);
    }
}
