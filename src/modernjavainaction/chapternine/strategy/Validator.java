package modernjavainaction.chapternine.strategy;

public class Validator {
    private ValidationStrategy strategy;

    public Validator(ValidationStrategy strategy) {
        this.strategy = strategy;
    }

    public Validator() {
    }

    public boolean validate(String string) {
        return strategy.execute(string);
    }

    public boolean validate(String str, ValidationStrategy strategy) {
        return strategy.execute(str);
    }

    public static void main(String[] args) {
        Validator validator1 = new Validator(new IsNumericStrategy());
        validator1.validate("45444");

        Validator validator = new Validator(str -> str.matches("[a-z]+"));
        validator.validate("sdert");

        Validator validator2 = new Validator();
        validator2.validate("asde", str -> str.matches("[a-z]+"));

    }
}
