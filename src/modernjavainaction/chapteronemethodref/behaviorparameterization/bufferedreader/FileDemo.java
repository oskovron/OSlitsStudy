package modernjavainaction.chapteronemethodref.behaviorparameterization.bufferedreader;

import java.io.IOException;

public class FileDemo {

    public static void main(String[] args) throws IOException {
        FileUtil fileUtil = new FileUtil();
        String s = fileUtil.readFile(reader -> {
            try {
                return reader.readLine()+"\n"+reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        System.out.println(s);
    }
}
