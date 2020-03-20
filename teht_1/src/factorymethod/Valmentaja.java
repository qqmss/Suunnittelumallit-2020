package factorymethod;

public class Valmentaja extends AterioivaOtus {

    public Juoma createJuoma() {
        return new Maito();
    }
}
