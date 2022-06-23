package o.after;


public class StaffEmployeeAccountCreator implements EmployeeAcountCreator{
    @Override
    public Employee create(Applicant applicant) {
        return new Employee(applicant.getFirstName(), applicant.getLastName(),
                String.format("%s.%s@example.com", applicant.getFirstName(), applicant.getLastName()),
                true, false);
    }
}
