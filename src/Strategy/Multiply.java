/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Strategy;

/**
 *
 * @author Martin
 */
public class Multiply implements Strategy {

    @Override
    public int execute(int a, int b) {
        System.out.println("Called Multiply's execute()");
        return a * b;   // Do a multiplication with a and b
    }
}
