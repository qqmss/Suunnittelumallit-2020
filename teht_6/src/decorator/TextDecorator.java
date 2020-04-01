package decorator;

public abstract class TextDecorator implements Text{
    protected Text textToBeDecorated;

    public TextDecorator(Text textToBeDecorated) {
        this.textToBeDecorated = textToBeDecorated;
    }
    public void print() {
        textToBeDecorated.print();
    }
}
