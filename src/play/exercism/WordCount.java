package play.exercism;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCount {

    public static void main(String[] args) {
        String sentence = "\"That's the password: 'PASSWORD 123'!\", cried\tthe Special Agent.\nSo I fled.";
//        new WordCount().doSth(sentence);
        System.out.println(new WordCount().phrase(sentence));
    }

    public void doSth(String input) {
        String separators = "[:!?,\t\n\" \".]";
        for (String s : input.toLowerCase().split(separators)) {
            System.out.println(s);
        }
    }

    public Map<String, Integer> phrase(String input) {
        return Arrays.stream(input
                .toLowerCase()
                .replaceAll("[^a-z0-9']", " ") //replace all non a-z0-9 and apostrophe with space
                .trim()
                .split("\\s+")) // split by one or more of any whitespace characters!
                //remove apostrophe in the beginning and ent of word
                //BUT leave for contractions like they're or it's.
                .map(x -> x.replaceAll("^'|'$", ""))
                .collect(Collectors.groupingBy(word -> word, Collectors.summingInt(a -> 1)));
    }
}
