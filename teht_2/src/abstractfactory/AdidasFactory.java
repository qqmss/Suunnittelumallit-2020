package abstractfactory;

public class AdidasFactory extends VaateFactory {

    private static AdidasFactory adidasFactory = new AdidasFactory();

    private AdidasFactory(){
    }

    public static AdidasFactory getInstance(){
        return adidasFactory;
    }

    @Override
    public Hattu createHattu() {
        return new Lippis();
    }

    @Override
    public Paita createPaita() {
        return new Tpaita();
    }

    @Override
    public Housut creteHousut() {
        return new Farmarit();
    }

    @Override
    public Kengät createKengät() {
        return new AdidasKengät();
    }
}
