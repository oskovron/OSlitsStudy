package modernjavainaction.chapternine.strategy;

public class ValidatorTwo {

    public boolean validate(String str, ValidationStrategy strategy) {
        return strategy.execute(str);
    }

    public static void main(String[] args) {
        ValidatorTwo validator2 = new ValidatorTwo();
        validator2.validate("asde", str -> str.matches("[a-z]+"));

    }
}
