/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

/**
 *
 * @author Martin
 */
/* The test class or client */
public class CommandTest {

    public static void Test() {
        Light lamp = new Light();
        Command switchUp = new FlipUpCommand(lamp);
        Command switchDown = new FlipDownCommand(lamp);

        Switch s = new Switch();
        s.storeAndExecute(switchUp);
        s.storeAndExecute(switchDown);
    }
}
