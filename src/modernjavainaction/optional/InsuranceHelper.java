package modernjavainaction.optional;

import java.util.Optional;

public class InsuranceHelper {
    public Optional<Insurance> nullSafeFindCheapestInsurance(Optional<Person> person, Optional<Car> car) {
        return person.flatMap(p -> car.map(c -> findCheap(p,c)));

    }

    private Insurance findCheap(Person p, Car c) {
        return new Insurance();
    }

}
