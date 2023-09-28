package modernjavainaction.chapternine.observer;

public class NYObserver implements Observer {
    @Override
    public void notify(String tweet) {
        if (tweet != null && tweet.contains("text")) {
            System.out.println("nY " + tweet);
        }
    }
}
