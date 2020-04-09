package memento;

public class Guesser extends Thread {
    private static int MAX_GUESS_VALUE = 100;
    private Object memento;

    public Guesser() {
        this.memento = Riddler.joinGame();
    }

    @Override
    public void run() {
        boolean win = false;
        int guess;
        for (guess = 0; !win && guess < MAX_GUESS_VALUE; guess++){
            win = Riddler.guess(memento, guess);
        }
        System.out.println(win ? "win " + guess : "loss");
    }
}
