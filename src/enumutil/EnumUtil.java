package enumutil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public final class EnumUtil {

    private EnumUtil(){}

    //todo: !!! important- eum class should have overriden toString() method!!!
    public static <T extends Enum<?>> List<String> getEnumValues(Class<T> enumeration) {
        T[] enumConstants = enumeration.getEnumConstants();
        return Arrays.stream(enumConstants)
                .map(Enum::toString)
                .collect(Collectors.toList());
    }
}
