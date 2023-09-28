package modernjavainaction.chapternine.strategy;

public class IsNumericStrategy implements ValidationStrategy {
    @Override
    public boolean execute(String str) {
        return str.matches("\\d+");
    }
}
