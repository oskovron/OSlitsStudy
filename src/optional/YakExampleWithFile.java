package optional;

import java.io.File;
import java.util.Optional;

public class YakExampleWithFile {
    public static void main(String[] args) {
        Optional<File> storedFile = Optional.empty();
        try {
            storedFile = Optional.of(storeFile("tmp/temp.txt"));
        } catch (Exception e) {
            System.out.println(e);
        }
                storedFile.ifPresentOrElse(
                        file -> file.getName(),
                        () -> System.out.println("file was not stored."));

        //todo: Or
//        System.out.println(storedFile.isPresent() ? storedFile.get().getName() : "file was not stored.");
    }

    private static File storeFile(String path) {
        System.out.println("store file stub");
        return new File(path);
    }
}
