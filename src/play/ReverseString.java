package play;

public class ReverseString {
    public static void main(String[] args) {
        String reversedString = "";
        String stringNormalOrder = "cool";
        String[] strArray = stringNormalOrder.split("");
        for (int i = strArray.length - 1; i >= 0; i--) {
            reversedString += strArray[i];
        }
        System.out.println(reversedString);

    }
}
