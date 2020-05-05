package command;

public class ValkokangasDownCommand implements Command {
    private Valkokangas valkokangas;

    public ValkokangasDownCommand(Valkokangas valkokangas) {
        this.valkokangas = valkokangas;
    }

    @Override
    public void execute() {
        valkokangas.down();
    }
}
