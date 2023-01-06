package PrimitivesStringWrappers;

public class PrimitivesLytvyn {
    public static void main(String[] args) {
//        int number = 100;
////        char character1 = 'a';
////        boolean isVisible = false;
////        double fi = 1.71;
////
////        number = 750;
////
////        isVisible = true;
////
////        int result;
////
////        boolean windowIsOpened = false;
////
////        windowIsOpened = true;
////
////        windowIsOpened = false;
////
////        System.out.println(number);
////        System.out.println(windowIsOpened);
////
////        int chyslo1 = 10;
////        int chyslo2 = 20;
////
////        double chyslo3 = 2.5;
////
////        System.out.println((int) (chyslo3 - chyslo1));

//        int salary = 2000;
//
//        double salary2 = 670.5;
//
//        char symbol = 'k';
//
//        double salary3 = 98.7;
//
//        boolean isAvailable = false;
//
//        salary3 = 670.5;
//
//        salary3 = salary2;
//
//        salary2 = 500;
//        System.out.println("salary3 "+ salary3);
//
//
//        salary = (int) salary3;
//        System.out.println("salary "+ salary);
//
//
//        salary2 = salary;
//
//        System.out.println("salary 2 result is: " + salary2);
//
//
//        //--------------------------------
//
//
//        int chyselnyk = 100;
//        int znamennyk = 333;
//
//        char znammennykSymbol = (char) znamennyk;
//
//        double result2 = (double) chyselnyk / (double) znamennyk;
//
//        System.out.println("Unicode symbol for number " + znamennyk + " is: " + znammennykSymbol);
//
//        System.out.println((double) chyselnyk / (double) znamennyk);

//        String welcomeText = new String("This is LITS AUtomation 15 group bla bla bla !!!");
//        String text2 = "This is another text example";
//
//        welcomeText = welcomeText.substring(10, 15);
//
//        System.out.print(welcomeText + "\"\"\"\"\\");
//
//        StringBuilder stb = new StringBuilder(welcomeText);

//        String text = "this is lits at-0XX";
//
//        String text1 = new String("this is lits at-0XX bla bla bla 9");
//
//        String text2 = new String(text);
//
//        text1 = text1.substring(0, text1.length() - 1).trim();
//
//        System.out.println(text1);
//
//        StringBuilder stb = new StringBuilder("");
//
//        String text3 = "gakf\\hjsda\"slkda";
//
//        text3 = text3 + text2 + "  " + text1 + "   " + " bvbvb";
//
//
//        System.out.println(text3);
//
//        System.out.println("Taras\nhjlagsfdhjaksd");
//
//        System.out.println("Taras");
//
//        System.out.println("Taras");
//
//        System.out.println("Taras");

        int chyslo = 100;

        Integer chysloObject = new Integer(100);

        Integer chysloObject1 = 100;

        Double chysloDoubleObject1 = 800.9;

        double zminna = 0;
        System.out.println(chysloObject.toString());
        System.out.println(chysloDoubleObject1.toString());

        System.out.println(100 + 500 + chysloObject.toString() + chysloDoubleObject1.toString());
        System.out.println("floatValue " + String.valueOf(chysloObject));

        chysloDoubleObject1 = Double.valueOf(zminna);

        System.out.println(chysloDoubleObject1);

        System.out.println("5678 " + 100 + 10);
        System.out.println(Integer.parseInt("1232") + 100);

        System.out.println(chyslo == zminna);
    }
}
