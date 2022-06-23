package s.after;

public class PersonDataValidator {
    public static boolean validName(Person person) {

        if (person.getFirstName() == null || person.getFirstName().isEmpty()) {
            System.out.println("You did not give us a valid first name!");
            return false;
        }
        if (person.getLastName() == null || person.getLastName().isEmpty()) {
            System.out.println("You did not give us a valid last name!");
            return false;
        }
        return true;
    }
}