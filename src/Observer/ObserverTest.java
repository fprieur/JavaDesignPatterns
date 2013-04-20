/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author Martin
 */
public class ObserverTest {

    public static void Test() {
        ConcreteObserver concreteObserver = new ConcreteObserver();
        Subject subject = new Subject();
        subject.addObserver(concreteObserver);
        subject.DoSomething();
    }
}
