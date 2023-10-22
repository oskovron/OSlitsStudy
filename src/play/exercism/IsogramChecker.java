package play.exercism;

import java.util.HashSet;

class IsogramChecker {

    public static void main(String[] args) {

        IsogramChecker isogramChecker = new IsogramChecker();
//        System.out.println(isogramChecker.isIsogram("lumberjacks"));
//        System.out.println(isogramChecker.isIsogram("background"));
//        System.out.println(isogramChecker.isIsogram("downstream"));
//        System.out.println(isogramChecker.isIsogram("six-year-old"));
//        System.out.println(isogramChecker.isIsogram("isogramS")); //false
//        System.out.println(isogramChecker.isIsogram("isograms")); //false
//        System.out.println(isogramChecker.isIsogram("as-dr-t fu lka")); //false

        System.out.println("");
        System.out.println(isogramChecker.isIsogramFilterMapAllMatch("lumberjacks"));
        System.out.println(isogramChecker.isIsogramFilterMapAllMatch("lum berjac ks"));
        System.out.println(isogramChecker.isIsogramFilterMapAllMatch("six-year-old"));
        System.out.println(isogramChecker.isIsogramFilterMapAllMatch("isogramS"));

    }

    boolean isIsogram(String phrase) {
        phrase=phrase.toLowerCase();
        String[] splitted = phrase.split("");
        for (String s : splitted) {
            if (!s.matches("[\\s-]") &&
                    phrase.indexOf(s) != phrase.lastIndexOf(s)) {
                return false;
            }
        }
        return true;
    }

    boolean isIsogramFilterMapAllMatch(String phrase) {
        return phrase.chars()
                .filter(Character::isLetter)
                .map(Character::toLowerCase)
                .allMatch(new HashSet<>()::add);
    }

}
