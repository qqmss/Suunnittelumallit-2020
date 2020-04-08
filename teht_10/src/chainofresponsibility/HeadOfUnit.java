package chainofresponsibility;

public class HeadOfUnit extends WageRiseHandler{
    private static final String NAME = "Head of unit";
    private static final double MAXRISE = 1.05;

    public HeadOfUnit() {
        super(NAME, MAXRISE);
    }
}
