/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.Observable;

/**
 *
 * @author Martin
 */
public class Subject extends Observable {

    public void DoSomething() {
        this.setChanged();
        this.notifyObservers();
    }

    @Override
    public String toString() {
        return "Subject";
    }
}
