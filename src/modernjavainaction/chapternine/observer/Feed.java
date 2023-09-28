package modernjavainaction.chapternine.observer;

import java.util.ArrayList;
import java.util.List;

public class Feed implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void notifyObserver(String tweet) {
        observers.forEach(observer -> observer.notify(tweet));
    }

    public static void main(String[] args) {
        Feed feed = new Feed();
        feed.registerObserver(new NYObserver());
        feed.notifyObserver("text");
    }
}
