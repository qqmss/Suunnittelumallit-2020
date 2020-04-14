package visitor;

public class Charmander implements PokemonState {
    private static final String name = "Charmander";
    private static final int ATK = 22;
    private static final int EVOLVE_EXP = 5;
    private int currentEXP = 0;
    private int bonus = 0;

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
        System.out.println("EXP: " + currentEXP + "/" + EVOLVE_EXP);
        if (currentEXP >= EVOLVE_EXP) {
            System.out.println(name  + " evolves");
            context.setState(new Charizard());
        }
    }

    @Override
    public void accept(PokemonVisitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void bonus(int bonus) {
        this.bonus += bonus;
        System.out.println("Bonus! " + this.bonus);
    }

    @Override
    public String toString() {
        return name;
    }
}
