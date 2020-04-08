package chainofresponsibility;

public class ChiefExecutiveOfficer extends WageRiseHandler {
    private static final String NAME = "Chief executive officer";
    private static final double MAXRISE = Double.POSITIVE_INFINITY;

    public ChiefExecutiveOfficer() {
        super(NAME, MAXRISE);
    }
}
