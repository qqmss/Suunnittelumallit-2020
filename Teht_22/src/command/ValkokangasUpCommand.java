package command;

public class ValkokangasUpCommand implements Command {
    private Valkokangas valkokangas;

    public ValkokangasUpCommand(Valkokangas valkokangas) {
        this.valkokangas = valkokangas;
    }

    @Override
    public void execute() {
        valkokangas.up();
    }
}
