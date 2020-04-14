package visitor;

public class PokemonContext {
    private PokemonState state;

    public PokemonContext(PokemonState state) {
        this.state = state;
    }

    public void setState(PokemonState state) {
        this.state = state;
    }

    public void attack(){
        state.doAttack(this);
    }

    public void run(){
        state.doRun(this);
    }

    public void accept(PokemonVisitor visitor){
        state.accept(visitor);
    }

    @Override
    public String toString() {
        return state.toString();
    }
}
