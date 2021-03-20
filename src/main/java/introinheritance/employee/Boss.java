package introinheritance.employee;

public class Boss extends Employee {

    public static final double LEADERSHIP_FACTOR = 0.1;

    private int numberOfEmployees;

    public Boss(String name, String address, double salary, int numberOfEmployees) {
        super(name, address, salary);
        raiseSalary(numberOfEmployees * (int) (LEADERSHIP_FACTOR * 100));
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }
}
