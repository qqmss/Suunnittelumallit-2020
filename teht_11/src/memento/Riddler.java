package memento;

import java.util.concurrent.ThreadLocalRandom;

public class Riddler {
    private static int MAX_ANSWER_VALUE = 300;

    public static Memento joinGame() {
        return new Memento(ThreadLocalRandom.current().nextInt(MAX_ANSWER_VALUE));
    }

    public static boolean guess(Object memento, int guess) {
        return ((Memento) memento).getAnswer() == guess;
    }


    private static class Memento {
        private int answer;

        private Memento(int answer) {
            this.answer = answer;
        }

        public int getAnswer() {
            return answer;
        }
    }
}
