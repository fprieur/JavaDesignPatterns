/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Martin
 */
public abstract class Observable {

    private List<Observer> observers;
    private Boolean hasChanged;

    Observable() {
        observers = new ArrayList<>();
    }

    public void setChanged() {
        hasChanged = true;
    }

    public void notifyObservers() {
        notifyObservers(null);
    }

    public void notifyObservers(Object arg) {
        if (hasChanged) {
            for (Observer observer : observers) {
                observer.update(this, arg);
            }
        }
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }
}
