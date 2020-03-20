package abstractfactory;

public class Main {

    public static void main(String[] args) {
        Jasper jasper = new Jasper(AdidasFactory.getInstance());
        System.out.println(jasper);
        System.out.println("Jasperista tulee insinööri.");
        jasper.useVaateFactory(BossFactory.getInstance());
        System.out.println(jasper);
    }
}
