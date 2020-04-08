package chainofresponsibility;

public class ImmediateSupervisor extends WageRiseHandler {
    private static final String NAME = "Immediate supervisor";
    private static final double MAXRISE = 1.02;

    public ImmediateSupervisor() {
        super(NAME, MAXRISE);
    }
}
