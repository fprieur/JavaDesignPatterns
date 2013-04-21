/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Singleton;

/**
 *
 * @author Martin
 */
public class SingletonTest {

    public static void Test() {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        int identityHashCode1 = System.identityHashCode(s1);
        int identityHashCode2 = System.identityHashCode(s2);

        System.out.println("identityHashCode for s1 : " + identityHashCode1);
        System.out.println("identityHashCode for s2 : " + identityHashCode2);
    }
}
