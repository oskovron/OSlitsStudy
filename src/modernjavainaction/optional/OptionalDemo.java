package modernjavainaction.optional;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class OptionalDemo {
    public static void main(String[] args) {
        Insurance cambridgeInsurance = new Insurance();
        cambridgeInsurance.setName("CambridgeInsurance");
        Optional<Insurance> insuranceOptional = Optional.of(cambridgeInsurance);

        insuranceOptional.filter(insurance -> insurance.getName().equals("CambridgeInsurance"))
                .ifPresent(x -> System.out.println("ok"));

    }



    /**
     * Listing 11.5
     * We explicitly said that there could be a case in which a nonexistent Person is passed to this method,
     * such as when that
     * Person is retrieved from a database via an identifier, and you want to model the possibility
     * that no Person exists in your data for the given identifier
     * @param person
     * @return
     */
    public String getCarInsuranceName(Optional<Person> person) {
        Optional<Insurance> insurance = person
                .flatMap(Person::getCar)
                .flatMap(Car::getInsurance);
        Optional<String> nameOptional = insurance
                .map(Insurance::getName);
        return nameOptional
                .orElse("Unknown");
    }

    public String getCarInsuranceName(Optional<Person> person, int minAge) {
        return person.filter(p -> p.getAge() >= minAge)
                .flatMap(Person::getCar)
                .flatMap(Car::getInsurance)
                .map(Insurance::getName)
                .orElse("Unknown");
    }

    public Set<String> getCarInsuranceNames(List<Person> persons) {
        return persons.stream()
                .map(Person::getCar)
                .map(x -> x.flatMap(Car::getInsurance))
                .map(x -> x.map(Insurance::getName))
                .flatMap(Optional::stream)
                .collect(Collectors.toSet());
    }
}
