package play;

import java.util.Arrays;
import java.util.Optional;

public class PlayStringAbbreviation {
    public static void main(String[] args) {
        String abbreviation = "";
        String name = "Delta national Something";
        String[] splitted = name.split(" ");
        //Todo: this is logic
//        for (int i=0; i<splitted.length; i++){
//            abbreviation+=splitted[i].substring(0,1);
//        }
//        abbreviation.toUpperCase();
//        System.out.println(abbreviation);


        Optional<String> reduce = Arrays.stream(splitted)
                .map(x -> x.substring(0, 1).toUpperCase())
                .reduce(String::concat);
        System.out.println(reduce.isPresent() ? reduce.get() : "Empty String.");


    }
}
