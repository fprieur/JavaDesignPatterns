/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author Martin
 */
public class Singleton {

    private static final Singleton instance = new Singleton();

    // Private constructor prevents instantiation from other classes
    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
}
