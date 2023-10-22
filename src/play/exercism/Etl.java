package play.exercism;

import java.util.*;

public class Etl {
    public static void main(String[] args) {
        Etl etl = new Etl();
        Map<Integer, List<String>> old = new HashMap<Integer, List<String>>() {
            {
                put(1, Arrays.asList("A", "E", "I", "O", "U"));
            }
        };
        Map<String, Integer> transformed = etl.transform(old);
        System.out.println(transformed);

        Map<String, Integer> stringIntegerMap = etl.transform2(old);
        System.out.println(stringIntegerMap);

    }

    Map<String, Integer> transform(Map<Integer, List<String>> old) {
        Map<String, Integer> newMap = new HashMap<>();
        Set<Map.Entry<Integer, List<String>>> entries = old.entrySet();

        for (Map.Entry<Integer, List<String>> entry: entries) {
            List<String> values = entry.getValue();
            for (String value: values) {
                newMap.put(value.toLowerCase(), entry.getKey());
            }
        }
        return newMap;
    }

    Map<String, Integer> transform2(Map<Integer, List<String>> old) {
        Map<String, Integer> newMap = new HashMap<>();
        old.forEach((k,v) -> v.forEach(c-> newMap.put(c.toLowerCase(), k)));
        return newMap;
    }

    Map<String, Integer> transformCommunity(Map<Integer, List<String>> old) {
        Map<String, Integer> newMap = new HashMap<>();
        old.forEach((key, value) -> {
            value.forEach(c -> newMap.put(c.toLowerCase(), key));
        });
        return newMap;
    }
}
