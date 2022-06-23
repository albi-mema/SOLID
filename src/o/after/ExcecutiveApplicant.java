package o.after;

public class ExcecutiveApplicant implements Applicant{
    String name;
    String surname;
    EmployeeAcountCreator accountCreator;

    public ExcecutiveApplicant(String name,String surname) {
        this.name = name;
        this.surname = surname;
        this.accountCreator = new ExcecutiveEmployeeAccountCreator();
    }

    @Override
    public String getFirstName() {
        return name;
    }

    @Override
    public String getLastName() {
        return surname;
    }

    @Override
    public EmployeeAcountCreator createEmployee() {
        return accountCreator;
    }


}
