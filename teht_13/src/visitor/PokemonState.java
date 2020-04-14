package visitor;

public interface PokemonState {
    void doAttack(PokemonContext context);
    void doRun(PokemonContext context);
    void doTryEvolve(PokemonContext context);
    void accept(PokemonVisitor visitor);
    void bonus(int bonus);
}
