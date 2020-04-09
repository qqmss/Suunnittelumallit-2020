package memento;

public class Main {

    public static void main(String[] args) {
        Guesser[] guesser = new Guesser[6];
        for(int i = 0; i < guesser.length; i++){
            guesser[i] = new Guesser();
            guesser[i].start();
        }

    }
}
