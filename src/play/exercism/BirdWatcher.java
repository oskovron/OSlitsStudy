package play.exercism;

import java.util.Arrays;
import java.util.List;

public class BirdWatcher {

    public static void main(String[] args) {
        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
                new BirdWatcher(birdsPerDay)
                        .getLastWeek().stream().forEach(System.out::println);
    }
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay;
    }

    public List<int[]> getLastWeek() {
        List<int[]> ints = Arrays.asList(birdsPerDay);
        List<int[]> ints1 = ints.subList(Math.max(ints.size() - 3, 0), ints.size());
//        ints1.toArray(int[]a
//        )

        return ints1;
    }

    public int getToday() {
        throw new UnsupportedOperationException("Please implement the BirdCount.getToday() method");
    }

    public void incrementTodaysCount() {
        throw new UnsupportedOperationException("Please implement the BirdCount.incrementTodaysCount() method");
    }

    public boolean hasDayWithoutBirds() {
        throw new UnsupportedOperationException("Please implement the BirdCount.hasDayWithoutBirds() method");
    }

    public int getCountForFirstDays(int numberOfDays) {
        throw new UnsupportedOperationException("Please implement the BirdCount.getCountForFirstDays() method");
    }

    public int getBusyDays() {
        throw new UnsupportedOperationException("Please implement the BirdCount.getBusyDays() method");
    }
}
