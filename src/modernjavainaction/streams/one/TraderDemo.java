package modernjavainaction.streams.one;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TraderDemo {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        List<Transaction> trOne = transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .collect(Collectors.toList());
        trOne.forEach(System.out::println);

        System.out.println("*******two");
        List<String> uniqueCities = transactions.stream()
                .map(transaction -> transaction.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());
        uniqueCities.forEach(System.out::println);

        System.out.println("*******three");
        List<Trader> cambridge = transactions.stream()
                .map(Transaction::getTrader)
                .distinct()
                .filter(trader -> trader.getCity().equalsIgnoreCase("cambridge"))
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());
        cambridge.forEach(System.out::println);

        System.out.println("*******four");
        System.out.println("Return a string of all traders’ names sorted alphabetically: ");
        String allTradersNames = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .sorted()
                .reduce("", (a1,a2) -> a1 + a2 +" ");
        System.out.println("allTradersNames = " + allTradersNames);

        System.out.println("*******five");
        System.out.println("Are any traders based in Milan?");
        boolean milan = transactions.stream()
                .anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan"));

        System.out.println("*********Six");
        System.out.println("Print the values of all transactions from the traders living in Cambridge.");
        transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equals("Cambridge"))
                .forEach(trader -> System.out.println(trader.getValue()));

        System.out.println("*Seven");
        System.out.println("What’s the highest value of all the transactions?");
        Optional<Integer> maxValue = transactions.stream()
                .map(x -> x.getValue())
                .reduce(Integer::max);
        System.out.println("maxValue = " + maxValue);

        System.out.println("**********");
        System.out.println(" Finds the transaction with the smallest value");
        Optional<Transaction> minTransaction = transactions.stream()
                .min(Comparator.comparing(Transaction::getValue));
        System.out.println(minTransaction);

    }
}
