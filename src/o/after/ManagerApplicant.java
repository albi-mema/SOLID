package o.after;

public class ManagerApplicant implements Applicant{
    String name;
    String surname;
    EmployeeAcountCreator accountCreator;

    public ManagerApplicant(String name,String surname) {
        this.name = name;
        this.surname = surname;
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

