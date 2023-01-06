package modernjavainaction.streams.workwithfilesstreams;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Stream;

public class WorkWithFilesNIOStreams {
/**
    Streams from files
    Java’s NIO API (non-blocking I/O), which is used for I/O operations such as processing a file, has been updated to take advantage of the Streams API. Many static methods in java.nio.file.Files return a stream. For example, a useful method is
    Files.lines, which returns a stream of lines as strings from a given file. Using what
    you’ve learned so far, you could use this method to find out the number of unique
    words in a file as follows:
 */
//    long uniqueWords = 0;
//try(Stream<String> lines =
//            Files.lines(Paths.get("data.txt"), Charset.defaultCharset())){
//        uniqueWords = lines.flatMap(line -> Arrays.stream(line.split(" ")))  //Generates stream of words
//                .distinct()
//                .count();
//    }
//catch(IOException e){
//
//    }

    public static void main(String[] args) {
        long uniqueWords =0;
        try (Stream<String> lines =
                     Files.lines(Paths.get("C:\\Users\\Oksana\\gitStudy\\OSlitsStudy\\src\\resources\\charge HR reset.txt"),
                             Charset.defaultCharset())) {
            uniqueWords = lines.flatMap(line -> Arrays.stream(line.split(" ")))
                    .distinct()
                    .count();
//            List<String> collect = lines.filter(line -> line.startsWith("2."))
//                    .collect(Collectors.toList());
//            System.out.println(collect);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
