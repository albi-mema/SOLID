package s.after;


public class main {
    public static void main(String[] args) {


        System.out.println("Welcome to my application");
        Person person = new PersonDataGetter().getData();
        if(PersonDataValidator.validName(person)){
            System.out.println(String.format("Your username is %s %s", person.getFirstName(), person.getLastName()));
        }
        System.out.println("End of application");
    }
}
