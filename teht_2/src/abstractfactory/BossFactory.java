package abstractfactory;

public class BossFactory extends VaateFactory {

    private static BossFactory bossFactory = new BossFactory();

    private BossFactory(){
    }

    public static BossFactory getInstance(){
        return bossFactory;
    }

    @Override
    public Hattu createHattu() {
        return new BossHattu();
    }

    @Override
    public Paita createPaita() {
        return new BossPaita();
    }

    @Override
    public Housut creteHousut() {
        return new BossHousut();
    }

    @Override
    public Kengät createKengät() {
        return new BossKengät();
    }
}
