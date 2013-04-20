/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author Martin
 */
public class ConcreteObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Notification from " + o.toString());
    }
}
