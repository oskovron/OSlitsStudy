package modernjavainaction.optional.exerciseproperties;

import java.util.Optional;

public class OptionalUtility {
    private OptionalUtility(){}

    public static Optional<Integer> stringToInt(String s) {
        try {
            return Optional.of(Integer.parseInt(s));
        } catch (NumberFormatException nfe){
            return Optional.empty();
        }
    }
}
