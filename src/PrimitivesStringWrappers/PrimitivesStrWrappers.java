package PrimitivesStringWrappers;

import java.util.Arrays;
import java.util.List;

public class PrimitivesStrWrappers {
    public static void main(String[] args) {
        int bit = 20;
//        double i;
////        bit <<= 1;
//        System.out.println(bit);
//
//        System.out.println(Math.abs( -25));
//
//        i = (Math.pow(bit,2));
//        System.out.println(i);
//        System.out.println(Math.round(i));
//
//        i=Math.sqrt(i);
//        System.out.println(i);
//
//        int bit1 = 8;
//        bit1 ^= bit1;
//        System.out.println(bit1);
//
//        int test1 = Math.abs(-150);
//        System.out.println(test1);
//        int test21 = Math.max(150, 250);
//        System.out.println(test21);
//        double test211 = Math.pow(5, 2);
//        System.out.println(test211);
//        long test212 = Math.round(test211);
//        System.out.println(test212);
//        double test213 = Math.sqrt(5);
//        System.out.println(Math.round(test213));
//
//
//        int s1 = Math.abs(bit);
//        System.out.println("abs " + bit);
//
//        Integer integer = new Integer(5);
//        System.out.println(integer);
//        int x1 = integer + 10;
//        System.out.println(x1);


//        for (int i=0; i < 10; i++){
//            System.out.println(Math.random());
//        }

//        for (int i=0; i<6; i++){
//            System.out.println(random(1, 19));
//        }

//        System.out.println(Math.round(2.4));

//        Integer integer = new Integer(5);
//        System.out.println(integer);
//
//        int x1 = integer + 10;
//
//        String test13213 = "15";
//        int test312 = Integer.parseInt(test13213);
//        System.out.println(test312);
//
//        String str1 = "3";
//        int parseStr = Integer.parseInt(str1);
//        System.out.println(parseStr);
//
//        int sum = parseStr + x1;
//        System.out.println(sum);
//
//        Integer integ = new Integer("6");
//        System.out.println(integ);
//
//        Integer integ2 = 7;
//        System.out.println(integ2);
//
//        int a = 5;
//        Integer aa = a;
//        System.out.println("aa " + aa);
//
//        char ch = '1';
//        String chStr = String.valueOf(ch); //wrap char to String
//        int strParse = Integer.parseInt(chStr);
//        System.out.println(strParse);
//
//        System.out.println(Integer.parseInt("0011", 2));
//
//        System.out.println("****************");
//
//        int r = 5;
//
//        Integer q = Integer.valueOf(r);
//        Integer w = Integer.valueOf("1234");
//        Integer e = Integer.valueOf("0001", 2);
//        System.out.println(q);
//        System.out.println(w);
//        System.out.println(e);
//
//        System.out.println(Integer.toString(5, 2));
//
//        boolean b = true;
//        String rer = "b is " +b;
//        System.out.println(rer);

//        StringBuffer sb = new StringBuffer("text");
//        sb.append(new Integer(2))
//                .append(" asd ")
//                .append(Arrays.asList(1,2,3));
//        System.out.println(sb + "sb");

//        String numbers =  "0123456789";
//        StringBuffer sb = new StringBuffer(numbers);
//        System.out.println(sb.substring(2));
//        System.out.println(sb);
//        System.out.println();
//        System.out.println(sb.substring(2,8));
//
//        System.out.println(sb.replace(3,5, "aswe"));
//        System.out.println(sb);
//
//        sb = new StringBuffer(numbers);
//        System.out.println(sb.reverse());
//        System.out.println(sb.reverse());
//
//        System.out.println(sb.delete(3,6));
//        System.out.println(sb);
//        System.out.println(sb.deleteCharAt(2));
//        System.out.println(sb.insert(2,"two"));


        Human max = new Human("Макс");
        String out = "Java объект: " + max;
        System.out.println(out);

        String a = String.valueOf(2);
        String b = String.valueOf(new Human("Sad"));
        String c = String.valueOf(true);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        List<String> strList = Arrays.asList(
                "asd nd",
                "aswe dfr",
                "aswr bgt"
        );
        String people = String.join(";", strList);
        System.out.println(people);

       String [] arrStr = people.split(";");
       for (String ds: arrStr){
           System.out.println(ds);
       }

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(alphabet.indexOf('A'));

        String filePath = "D:\\Movies\\Futurama.mp4";
        int ind = filePath.lastIndexOf('\\');
        String fileName = filePath.substring(ind+1);
        System.out.println(fileName);

        String str1 = "fork";
        String str2 = "spoon";
        str1 = str1.concat(str2);
        System.out.println(str1);

        String str3 = String.valueOf(45);
        System.out.println(str3);

        String toFormat = "I'm %s %s. Born in %d";
        String user1 = String.format(toFormat, "OOO", "sss", 552);
        System.out.println(user1);

        char [] chArr = {'a','l','o','h','a'};
        String strCh = new String(chArr);
        System.out.println(strCh);








    }

    static int random(int min, int max) {
        return  (int) (Math.random() *max / min);
    }
}

 class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Человек с именем " + name;
    }

}
