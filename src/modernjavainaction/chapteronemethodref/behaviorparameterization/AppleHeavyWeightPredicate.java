package modernjavainaction.chapteronemethodref.behaviorparameterization;

/**
 * Strategy pattern
 */
public class AppleHeavyWeightPredicate implements ApplePredicate {
    @Override
    public boolean test(AppleB apple) {
        return apple.getWeight() > 150;
    }
}
