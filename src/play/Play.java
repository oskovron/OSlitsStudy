package play;

public class Play {

    public static void main(String[] args) {
        String info= "[INFO]: Disk defragmented";
        System.out.println(logLevel(info));
    }
    public static String message(String logLine) {
        int indexOfDots = logLine.indexOf(":");
        return logLine.substring(indexOfDots+1).trim();
    }

    public static String logLevel(String logLine) {
        int indexOfOpening = logLine.indexOf("[");
        int indexOfClosingColon = logLine.indexOf("]", 1);
        return logLine.substring(indexOfOpening+1, indexOfClosingColon).toLowerCase();
    }

    public static String reformat(String logLine) {
        String[] splitted = logLine.split(":");

        String code = splitted[0];
        int indexOfOpeningColon = code.indexOf("[");
        int indexOfClosingColon = code.indexOf("]", 1);
        String codeReformatted = code.substring(indexOfOpeningColon + 1, indexOfClosingColon).toLowerCase();

        String message = splitted[1].trim();
        return message + " (" + codeReformatted + ")";
    }

    public String twofer(String name) {
        if (name!=null) {
            return "One for " + name + (", one for me.");
        } else {
            return "One for you, one for me.";
        }
    }
}
