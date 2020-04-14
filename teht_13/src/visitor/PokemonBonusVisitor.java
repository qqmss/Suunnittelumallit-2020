package visitor;

public enum PokemonBonusVisitor implements PokemonVisitor {
    INSTANCE;

    public static PokemonBonusVisitor getInstance() {
        return INSTANCE;
    }
    
    @Override
    public void visit(Charizard charizard) {
        charizard.bonus(3);
    }

    @Override
    public void visit(Charmeleon charmeleon) {
        charmeleon.bonus(2);
    }

    @Override
    public void visit(Charmander charmander) {
        charmander.bonus(1);
    }
}
