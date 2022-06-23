package o.after;

import o.after.Applicant;

public class ExcecutiveEmployeeAccountCreator implements EmployeeAcountCreator{
    @Override
    public Employee create(Applicant applicant) {
        return new Employee(applicant.getFirstName(), applicant.getLastName(),
                String.format("%s.%s@example.com", applicant.getFirstName(), applicant.getLastName()),
                true, true);
    }
}
