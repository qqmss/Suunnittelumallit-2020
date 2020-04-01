package state;

public interface PokemonState {
    void doAttack(PokemonContext context);
    void doRun(PokemonContext context);
    void doTryEvolve(PokemonContext context);
}
