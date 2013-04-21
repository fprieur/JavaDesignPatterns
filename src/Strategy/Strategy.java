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
 * The classes that implement a concrete strategy should implement this. The
 * Context class uses this to call the concrete strategy.
 */
public interface Strategy {

    int execute(int a, int b);
}
