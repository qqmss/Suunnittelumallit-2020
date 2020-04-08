package chainofresponsibility;

public class Main {

    public static void main(String[] args) {
        WageRiseHandler ceo = new ChiefExecutiveOfficer();
        WageRiseHandler head = new HeadOfUnit();
        WageRiseHandler supervisor = new ImmediateSupervisor();
        Employee employee = new Employee(100);

        supervisor.setNextHandler(head);
        head.setNextHandler(ceo);

        supervisor.handle(employee, 101.8);
        System.out.println("----------");
        supervisor.handle(employee, 105.0);
        System.out.println("----------");
        supervisor.handle(employee, 180.5);
    }
}
