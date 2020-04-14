package visitor;

public interface PokemonVisitor {
    void visit(Charizard charizard);
    void visit(Charmeleon charmeleon);
    void visit(Charmander charmander);
}
