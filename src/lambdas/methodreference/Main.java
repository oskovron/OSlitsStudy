package lambdas.methodreference;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream.of("one", "two")
                .map(String::toUpperCase)
                .forEach(System.out::println);

        Stream.of(new Student("Sam"), new Student("Anton"))
                .map(new Student("")::some)
                .forEach(System.out::println);

        Stream.of("Max", "Dean")
                .map(Student::new)
                .forEach(x -> System.out.println(x.getStudent()));

        System.out.println("*****");
        List<String> listStrings = Arrays.asList("hi", "go" , "Bye");


    }

}

class Student {
    private String student;

    public Student(String student) {
        this.student = student;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String some(Student student) {
        return student.getStudent();
    }

}
