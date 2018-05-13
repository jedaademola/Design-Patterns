/*
 * Created on Jan 25, 2018
 */
package Lab11.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<String> names = new ArrayList<>();
    List<Observer> observers = new ArrayList<Observer>();

    public List<String> getNames() {
        return names;
    }

    public void addName(String name) {
        names.add(name);
        notifyAllObserver();
    }

    public void removeName(String name) {
        names.remove(name);
        notifyAllObserver();
    }

    public void attache(Observer observer) {
        observers.add(observer);
    }

    public void detache(Observer observer) {
        observers.remove(observer);
    }

    public void notifyAllObserver() {
        for (Observer ob : observers) {
            ob.update();
        }
    }
}
