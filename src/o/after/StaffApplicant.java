package o.after;


public class StaffApplicant implements Applicant {
    String name;
    String surname;
    EmployeeAcountCreator accountCreator;


    public StaffApplicant(String name, String surname) {
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


