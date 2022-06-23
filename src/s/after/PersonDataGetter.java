package s.after;

import java.util.Scanner;


public class PersonDataGetter {
    public static Person getData(){
        Scanner input = new Scanner(System.in);
        Person person = new Person();

        System.out.println("What is your first name: ");
        person.setFirstName(input.next());

        System.out.println("What is your last name: ");
        person.setLastName(input.next());

        return person;
    }

}
