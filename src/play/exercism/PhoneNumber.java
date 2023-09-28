package play.exercism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PhoneNumber {
    private String phoneNumber;

    public PhoneNumber(String phoneNumber) {
        this.phoneNumber = formatPhoneNumber(phoneNumber);
    }

    String getNumber() {
        return phoneNumber;
    }

    public static String formatPhoneNumber(String number) {
        List<String> charactersToRemove = new ArrayList<>();
        charactersToRemove.addAll(Arrays.asList("+", "(", ")", " ", ".", "-"));
        for (String character : charactersToRemove) {
            if (number.contains(character)) {
                number = removeCharFromString(number, character);
            }
        }

        validateLength(number);

        if (number.length() == 11 && number.charAt(0)=='1') {
            number = number.replaceFirst("1", "");
        }
        if (number.length() == 11 && !(number.charAt(0)=='1')){
            throw new IllegalArgumentException("11 digits number must start with 1");
        }

        validateCode("area", number.charAt(0));
        validateCode("local", number.charAt(3));
        return number;
    }

    public static void validateLength(String number){
        if(number.length()>11) {
            throw new IllegalArgumentException("Length can't be more than 11");
        }

        if(number.length()<10) {
            throw new IllegalArgumentException("Length can't be less than 10");
        }
    }

    public static void validateCode(String codeType, char code) {
        if (code=='0') {
                throw new IllegalArgumentException(codeType + "code can not start with zero");
        }
        if ((code=='1')) {
            throw new IllegalArgumentException(codeType + "code can not start with one");
        }
    }

    public static String removeCharFromString(String number, String character) {
        if (number.contains(character)) {
            number = number.replace(character, "");
        }
        return number;
    }
}
