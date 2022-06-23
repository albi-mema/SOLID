package l.after;

public class Employee implements IEmployee{
    public String firstName;
    public String lastName;
    public Employee manager;
    public double salary;

    @Override
    public void assignManager(Employee manager){
        this.manager = manager;
    }

    @Override
    public void calculatePerHourRate(int rank){
        double baseAmount = 12.50;
        salary = baseAmount + (rank * 2);
    }
}
