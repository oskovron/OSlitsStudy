package play.exercism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PhoneNumberFormat {

    public static void main(String[] args) {
//        System.out.println("1: " + PhoneNumber.formatPhoneNumber("1 (023) 456-7890"));
//        System.out.println("2: " + formatPhoneNumber("+1 (013)-195-0253"));
//        System.out.println("3: " + formatPhoneNumber("+1 (113)-095-0253"));
//        System.out.println("4: " + PhoneNumber.formatPhoneNumber("+1 (613)-995-02533"));
//        System.out.println("4: " + PhoneNumber.formatPhoneNumber("+1 (613)-995-023"));
//        System.out.println("5: " + formatPhoneNumber("+3 (613)-995-0253"));
//        System.out.println("6: " + formatPhoneNumber("613-995-0253"));
//        System.out.println("7: " + formatPhoneNumber("1 613 995 0253"));
//        System.out.println("8: " + formatPhoneNumber("2 613 995 0253"));
//        System.out.println("9: " + formatPhoneNumber("613.995.0253"));

        System.out.println("9: " + PhoneNumber.formatPhoneNumber("123456789"));

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
        if (number.length() == 11 && number.startsWith("1")) {
            number = number.replaceFirst("1", "");
        } else if (number.length() == 11 && !number.startsWith("1")){
//            throw new IllegalArgumentException("11 digits number must start with 1");
            System.out.println("11 digits number must start with 1");
        }

        validateCode("area", number.charAt(0));
        validateCode("local", number.charAt(3));
        return number;
    }

    public static void validateLength(String number){
        if(number.length()>11) {
//            throw new IllegalArgumentException("Length can't be more than 11");
            System.out.println("Length can't be more than 11");
        }

        if(number.length()<10) {
            throw new IllegalArgumentException("Length can't be less than 10");
        }
    }

    public static void validateCode(String codeType, char code) {
        if (code=='0') {
//                throw new IllegalArgumentException("code can not start with zero");
            System.out.println(codeType + " code can not start with zero");
        }
        if ((code=='1')) {
//            throw new IllegalArgumentException("code can not start with one");
            System.out.println(codeType + " code can not start with one");
        }
    }

    public static String removeCharFromString(String number, String character) {
        if (number.contains(character)) {
            number = number.replace(character, "");
        }
        return number;
    }

}
