package state;

public class Charizard implements PokemonState {
    private static final String name = "Charizard";
    private static final int ATK = 33;
    private int currentEXP = 0;

    @Override
    public void doAttack(PokemonContext context) {
        System.out.println("ATK: " + ATK);
        currentEXP++;
        doTryEvolve(context);
    }

    @Override
    public void doRun(PokemonContext context) {
        currentEXP++;
        doTryEvolve(context);
    }

    @Override
    public void doTryEvolve(PokemonContext context) {
        System.out.println("EXP: " + currentEXP);
    }

    @Override
    public String toString() {
        return name;
    }
}