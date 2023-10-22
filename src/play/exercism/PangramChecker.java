package play.exercism;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PangramChecker {
    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        PangramChecker pangramChecker = new PangramChecker();
        System.out.println(pangramChecker.isPangram("The quick brown fox jumps over the lazy dog."));
        System.out.println(pangramChecker.isPangram("/\"The quick brown fox jumps over the lazy dog."));
    }

    public boolean isPangram(String sentence) {
        Stream<String> alphabet = IntStream.rangeClosed('a', 'z').mapToObj(c -> Character.toString(c));
        return alphabet.allMatch(c -> sentence.toLowerCase().contains(c));
    }

    public boolean isPangramContainsAll(String sentence) {
        String[] sentenceSplitted = sentence.split("");
        return Arrays.asList(sentenceSplitted).containsAll(Arrays.asList(ALPHABET.split("")));
    }
}