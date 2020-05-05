package command;

public class Main {

    public static void main(String[] args) {
        Valkokangas valkokangas = new Valkokangas();
        Command up = new ValkokangasUpCommand(valkokangas);
        Command down = new ValkokangasDownCommand(valkokangas);
        Button buttonUp = new Button(up);
        Button buttonDown = new Button(down);

        buttonDown.push();
        buttonUp.push();
    }
}
