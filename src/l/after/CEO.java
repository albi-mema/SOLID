package l.after;

public class CEO extends Employee implements IEmployee{

    @Override
    public void calculatePerHourRate(int rank) {
        double baseAmount = 150;

        this.salary = baseAmount * rank;
    }

    @Override
    public void assignManager(Employee manager) {
        throw new UnsupportedOperationException("This CEO has no manager");
    }

    public void fireSomeone() {
        System.out.println("You're Fired!");
    }
}
