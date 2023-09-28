package modernjavainaction.optional.exerciseproperties;

import java.util.Optional;
import java.util.Properties;

public class PropertiesDemo {
    public static void main(String[] args) {
        Properties props = new Properties();
        props.setProperty("a", "5");
        props.setProperty("b", "true");
        props.setProperty("c", "-3");
        props.setProperty("d", "");

        PropertiesDemo.readDurationOptional(props, "a");
        PropertiesDemo.readDurationOptional(props, "b");
        PropertiesDemo.readDurationOptional(props, "c");
        PropertiesDemo.readDurationOptional(props, "d");
    }

    public static int readDurationOptional(Properties props, String name) {
        return Optional.ofNullable(props)
                .flatMap(x -> OptionalUtility.stringToInt(x.getProperty(name)))
                .filter(i -> i>0)
                .orElse(0);
    }

    public int readDuration(Properties props, String name) {
        String value = props.getProperty(name);
        if (value != null) {
            try {
                int i = Integer.parseInt(value);
                if (i > 0) {
                    return i;
                }
            } catch (NumberFormatException nfe) { }
        }
        return 0;
    }
}
