package modernjavainaction.chapteronemethodref.behaviorparameterization.bufferedreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.function.Function;

public class FileUtil {

    public String readFile(Function<BufferedReader, String> function) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(
                "src/resources/charge HR reset.txt"))) {
            return function.apply(reader);
        }
    }

}
