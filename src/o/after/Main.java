package o.after;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Applicant> applicants = Arrays.asList(
                new StaffApplicant("William", "Ardianto"),
                new ManagerApplicant("Wilson", "Lim"),
                new ExcecutiveApplicant("Wesley", "Lim")
        );
        List<Employee> employees = applicants
                .stream()
                .map(p -> p.createEmployee()
                           .create(p))
                .collect(Collectors.toList());


        for (Employee employee : employees) {
            System.out.println(String.format("%s %s: %s IsManager: %s IsExecutive: %s",
                    employee.firstName,
                    employee.lastName,
                    employee.email,
                    employee.isManager,
                    employee.isExecutive));
        }
    }
}

