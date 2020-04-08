package chainofresponsibility;

public abstract class WageRiseHandler {
    private WageRiseHandler nextHandler;
    private String name;
    private double maxRise;

    public WageRiseHandler(String name, double maxRise) {
        this.name = name;
        this.maxRise = maxRise;
    }

    public void setNextHandler(WageRiseHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(Employee employee, double newWage) {
        if (newWage / employee.getWage() <= maxRise) {
            wageRiseDecision(employee, newWage);
        } else if (nextHandler != null) {
            nextHandler.handle(employee, newWage);
        }
    }

    private void wageRiseDecision(Employee employee, double newWage) {
        System.out.println(name + " handles wage rise decision.");
        System.out.println("Current wage: " + employee.getWage());
        System.out.println("Requested wage: " + newWage);
        System.out.println("Rise of " + ((newWage / employee.getWage() - 1) * 100) + "%");
    }
}
