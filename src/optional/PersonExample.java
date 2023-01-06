package optional;

import java.util.Optional;

public class PersonExample {
    public static void main(String[] args) {
        Person person = new Person("Oksana", null);
        String emailOptioal = person.getEmail()
                .map(String::toUpperCase)
                .orElse("no email found for user" + person.getName());
        System.out.println(emailOptioal);

        System.out.println("**********");
        Optional<String> optional = Optional.ofNullable(null);
        optional.ifPresent(System.out::println);
        optional.ifPresentOrElse(x -> System.out.println(x.toLowerCase()), () -> System.out.println("runnable"));
//        System.out.println(optional.get());

//        String orElseGet = optional
//                .map(String::toLowerCase)
//                .orElseGet(() -> person.getName());
//        System.out.println(orElseGet);



    }
}

class Person {
    private String name;
    private String email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
