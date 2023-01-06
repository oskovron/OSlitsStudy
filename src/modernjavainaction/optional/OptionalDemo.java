package modernjavainaction.optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

    }

    public String getCarInsuranceName(Optional<Person> person) {
        Optional<Insurance> insurance = person.flatMap(Person::getCar)
                .flatMap(Car::getInsurance);
        Optional<String> nameOptional = insurance.map(Insurance::getName);
        return nameOptional.orElse("Unknown");
    }
}
