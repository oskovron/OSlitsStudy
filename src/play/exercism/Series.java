package play.exercism;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Series {

    private String series;
    public static void main(String[] args) {
        Series  series3 = new Series("123456");
//        Series  series4 = new Series("123456");
//        series3.slices(3).forEach(System.out::println);
//        series4.slices(4).forEach(System.out::println);

//        Series slicesOfTwoOverlap = new Series("9142");
//        slicesOfTwoOverlap.slices(2).forEach(System.out::println);
//
//        Series slicesOfLongSeries = new Series("918493904243");
//        slicesOfLongSeries.slices(5).forEach(System.out::println);

//        Series series = new Series("12345");
//        series.slices(6).forEach(System.out::println);
//        Series empty = new Series("");
        series3.stream(3).forEach(System.out::println);

//        empty.slices(1).forEach(System.out::println);
    }

    public Series(String series) {
        this.series = series;
    }

    public List<String> slices(int splitLength) {
        if (splitLength<1) {
            throw new IllegalArgumentException("Slice size is too small.");
        }
        if (splitLength>series.length()){
            throw new IllegalArgumentException("Slice size is too big.");
        }
        List<String> splittedList = new ArrayList<>();
        for (int i =0; i<=series.length()+2; i++) {
            if (series.length()>=splitLength) {
                String substring = series.substring(0, splitLength);
                splittedList.add(substring);
                series = series.substring(1);
            }
        }
        return splittedList;
    }

    //Solution by charles-wangkai
    public List<String> stream(int length) {
        if (length<1) {
            throw new IllegalArgumentException("Slice size is too small.");
        }
        if (length>series.length()){
            throw new IllegalArgumentException("Slice size is too big.");
        }
        return IntStream
                .rangeClosed(0, series.length() - length)
                .mapToObj(i -> series.substring(i, i + length))
                .collect(Collectors.toList());
    }

}
