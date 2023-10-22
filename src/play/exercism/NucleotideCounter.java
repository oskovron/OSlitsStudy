package play.exercism;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NucleotideCounter {

    public static void main(String[] args) {
        String sequence = "AACCGGT";
        String sequenceInvalidChars = "AACCGGTZ";
        System.out.println(new NucleotideCounter(sequence).nucleotideCounts());
        System.out.println(new NucleotideCounter(sequenceInvalidChars).nucleotideCounts());

//        Map<Character, Integer> collect = Arrays.stream(sequence.split(""))
//                .collect(Collectors.groupingBy(a -> a.charAt(0), Collectors.summingInt(a -> 1)));
//        System.out.println(collect);
    }

    private Map<Character,Integer> nucleotideScore = new HashMap<Character, Integer>() {{
        put('A',0);
        put('C',0);
        put('G',0);
        put('T',0);
    }};
    private String sequence;

    NucleotideCounter(String sequence) {
        this.sequence = sequence;
        //A, C, G, T
        if (!sequence.matches("[ACGT]+")){
            throw new IllegalArgumentException("sequence must contain only ACGT symbols");
        }
    }

    int count(char base) {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    Map<Character, Integer> nucleotideCounts() {
        return Arrays.stream(sequence.split(""))
                .collect(Collectors.groupingBy(a -> a.charAt(0), Collectors.summingInt(a -> 1)));
    }
}
