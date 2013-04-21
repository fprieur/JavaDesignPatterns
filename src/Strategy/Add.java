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
 * Implements the algorithm using the strategy interface
 */
public class Add implements Strategy {

    @Override
    public int execute(int a, int b) {
        System.out.println("Called Add's execute()");
        return a + b;  // Do an addition with a and b
    }
}
