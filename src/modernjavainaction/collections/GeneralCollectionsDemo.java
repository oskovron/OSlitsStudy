package modernjavainaction.collections;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Map.entry;

public class GeneralCollectionsDemo {
    public static void main(String[] args) {
        List<String> friendsList = Arrays.asList("Raphael", "Olivia", "Thibaut");
        friendsList.set(1, "good");
        System.out.println(friendsList);
//        friendsList.add("error");

        List<String> intsList = new ArrayList<>();
        intsList.addAll(Arrays.asList("one", "two"));
        intsList.add("three");
        System.out.println("intsList = " + intsList);
        intsList.replaceAll(chr -> Character.toUpperCase(chr.charAt(0)) + chr.substring(1));
        System.out.println("intsList Uppercase = " + intsList);

        Set<String> setOfFriends = new HashSet<>(Arrays.asList("Raphael", "Olivia", "Thibaut"));
        Set<String> fff = Stream.of("Raphael", "Olivia", "Thibaut")
                .collect(Collectors.toSet());

        List<String> ddd = List.of("Raphael", "Olivia", "Thibaut");
//        ddd.set(1, "error");

        Map.of(1, "one");
        Set<String> one = Set.of("One", "Two");
//        Set<String> one = Set.of("One", "One");

        Map<String, String> favouriteMovies
                = Map.ofEntries(entry("Raphael", "Star Wars"),
                entry("Cristina", "Matrix"),
                entry("Olivia", "h"));

        favouriteMovies.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(System.out::println);
        System.out.println("get or default: **********");
        String orDefault = favouriteMovies.getOrDefault("Olivia", "default");
        System.out.println("orDefault: " + orDefault);

        Map<String, String> movies = new HashMap<>();
        movies.put("Raphael", "Star Wars");
        movies.put("Cristina", "Matrix");
        movies.put("Olivia", "");
        movies.computeIfAbsent("Oliva", v -> v + "newVal");

        System.out.println("computeIfAbsent = " + movies);
        movies.computeIfPresent("Olivia", (v, k) -> k + "newVal");
        System.out.println("computeIfPresent = " + movies);
        movies.remove("Olivia", "newVal");
        System.out.println("remove key value = " + movies);
        movies.replaceAll((k, v) -> v.toUpperCase());
        System.out.println(movies);

        Map<String, String> directors = new HashMap<>();
        directors.put("John Berk", "Maxt");
        Map<String, String> moviesAndDirectors = new HashMap<>(movies);
        moviesAndDirectors.putAll(directors);
        System.out.println("moviesAndDirectors = " + moviesAndDirectors);

        Map<String, Integer> moviesQuiz = new HashMap<>();
        moviesQuiz.put("JamesBond", 20);
        moviesQuiz.put("Matrix", 15);
        moviesQuiz.put("Harry Potter", 5);
        moviesQuiz.entrySet().removeIf(entry -> entry.getValue() < 10);
        System.out.println(moviesQuiz);

        Map<String, Long> moviesToCount = new HashMap<>();
        String movieName = "JamesBond";
        moviesToCount.put(movieName, 1L);
        moviesToCount.merge(movieName, 1L, (v1, v2) -> v2 + v1);
        System.out.println(moviesToCount);

        //        moviesAndDirectors.merge()
        Map<String, String> family = Map.ofEntries(
                entry("Teo", "Star Wars"),
                entry("Cristina", "James Bond"));
        Map<String, String> friends = Map.ofEntries(
                entry("Raphael", "Star Wars"),
                entry("Cristina", "Matrix"));
        Map<String, String> everyone = new HashMap<>(family);
        friends.forEach((k, v) -> everyone.merge(k, v, (m1, m2) ->
                m1 + "&" + m2));
        System.out.println("everyone**** ");
        System.out.println(everyone);
        System.out.println("everyone**** ");
    }
}
