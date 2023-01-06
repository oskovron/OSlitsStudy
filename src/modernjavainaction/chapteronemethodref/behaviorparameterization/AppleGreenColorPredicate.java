package modernjavainaction.chapteronemethodref.behaviorparameterization;

/**
 * Strategy pattern
 */
public class AppleGreenColorPredicate implements ApplePredicate{
    @Override
    public boolean test(AppleB appleB) {
        return appleB.getColor().equals("Green");
    }
}
