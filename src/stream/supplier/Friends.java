package stream.supplier;

public class Friends {
    private String firstName;
    private String lastName;
    private int age;
    private boolean isEmployed;

    public Friends(String firstName, String lastName, int age, boolean isEmployed) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isEmployed = isEmployed;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    private void privateMethod (String s) {
        System.out.println(s);
    }

    @Override
    public String toString() {
        return "Friends{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", isEmployed=" + isEmployed +
                '}';
    }
}
