/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

/**
 *
 * @author Martin
 */
/**
 * Configured with a ConcreteStrategy object and maintains a reference to a
 * Strategy object
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b) {
        return this.strategy.execute(a, b);
    }
}
