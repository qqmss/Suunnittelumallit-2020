package abstractfactory;

public class Jasper {

    private Hattu hattu;
    private Paita paita;
    private Housut housut;
    private Kengät kengät;

    public Jasper(VaateFactory factory){
        this.hattu = factory.createHattu();
        this.paita = factory.createPaita();
        this.housut = factory.creteHousut();
        this.kengät = factory.createKengät();
    }

    public void useVaateFactory(VaateFactory factory){
        this.hattu = factory.createHattu();
        this.paita = factory.createPaita();
        this.housut = factory.creteHousut();
        this.kengät = factory.createKengät();
    }

    public String toString() {
        return "Jasper: päälläni on " + hattu + ", " + paita + ", " + housut + " ja " + kengät + ".";
    }
}
