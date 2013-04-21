/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author Martin
 */
public class ConcreteObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Notification that something has changed in " + o.toString());
    }
}
