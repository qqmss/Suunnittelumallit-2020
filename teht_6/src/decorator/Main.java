package decorator;

public class Main {

    public static void main(String[] args) {

        Text decoratedText = new accessControlDecorator(new ConcreteText());
        decoratedText.print();
    }
}
