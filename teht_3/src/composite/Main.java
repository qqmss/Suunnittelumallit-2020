package composite;


public class Main {

    public static void main(String[] args) {
        Laiteosa emolevy = new Emolevy(); //komposiitti
        Laiteosa kotelo = new Kotelo(); //komposiitti
        emolevy.addOsa(new Prosesori());
        emolevy.addOsa(new Muistipiiri());
        kotelo.addOsa(emolevy);
        kotelo.addOsa(new Näytönohjain());
        kotelo.addOsa(new Verkkokortti());
        System.out.println("Emolevy yhteishinta: " + emolevy.laskeYhteishinta());
        System.out.println("Kotelo yhteishinta: " + kotelo.laskeYhteishinta());

        //Miten tehtaat voisi toimia.
        //PcFactory tehdas = KonkreettinenPc1Factory.getInstance();
        //Laiteosa tietokone = tehdas.createPc();
        //int pcHinta = tietokone.laskeYhteishinta();
    }
}
