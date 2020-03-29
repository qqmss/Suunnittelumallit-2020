package abstractfactory;

import java.io.FileReader;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {
        Properties properties = new Properties();
        Class adidasClass = null, bossClass = null;
        try {
            properties.load(new FileReader("teht_2/src/abstractfactory/tehdas.properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            adidasClass = Class.forName(properties.getProperty("adidas"));
            bossClass = Class.forName(properties.getProperty("boss"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Jasper jasper = null;
        try {
            jasper = new Jasper((VaateFactory) adidasClass.getMethod("getInstance").invoke(null, null));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(jasper);
        System.out.println("Jasperista tulee insinööri.");
        try {
            jasper.useVaateFactory((VaateFactory) bossClass.getMethod("getInstance").invoke(null, null));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(jasper);
    }
}
