package ooplab9;

public class myPersonApp {

    public static void main(String[] args) {
        Person person = new Person(
                "1900100111351",
                "Natpatcha Phetrat",
                new Address("34/7 M.5",
                        "Nakornsithammarat",
                        "80140"),
                new Job("manager",
                        50000));



        System.out.println(person.toString());

        person.getJob().setSalary(50000);

        System.out.println(person.getJob());


    }
}