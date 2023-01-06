package stream.supplier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierDemo {
    public static List<Friends> friendsList = new ArrayList<>();
    static String name;

    public static void main(String[] args) {
        friendsList.addAll(Arrays.asList(
                new Friends("Ross", "Geller", 32, true),
                new Friends("Monica", "Geller", 28, true),
                new Friends("Chandler", "Bing", 31, true),
                new Friends("Joey", "Tribbiany", 31, false),
                new Friends("Phoebe", "Buffe", 32, false),
                new Friends("Rachel", "Green", 27, false)));

        Supplier<Stream<String>> stringStreamSupplier = () -> friendsList.stream()
                .filter(Friends::isEmployed)
                .filter(x -> x.getAge() > 30)
                .map(friends -> friends.getFirstName() + " " + friends.getLastName());

        long count = stringStreamSupplier.get().count();
        System.out.println("Employed friends: " + count);

        name = "Ross";
        boolean isNamePresent = stringStreamSupplier.get().anyMatch(name -> name.contains(name));
        System.out.println(String.format("Is %s present? ", name) + isNamePresent);

        System.out.println("Sorted result: ");
        stringStreamSupplier.get().sorted(String::compareTo).forEach(System.out::println);

        Class<Friends> friendsClass = Friends.class;

    }
}
