package composite;

import java.util.ArrayList;
import java.util.List;

public class Kotelo implements Laiteosa {
    private List<Laiteosa> osaLista = new ArrayList<Laiteosa>();
    private int hinta = 15;

    @Override
    public int getHinta() {
        return hinta;
    }

    @Override
    public int laskeYhteishinta() {
        int yhteishinta = getHinta();
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
