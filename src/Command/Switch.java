/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Martin
 */
/* The Invoker class */
public class Switch {

    private List<Command> history = new ArrayList<Command>();

    public Switch() {
    }

    public void storeAndExecute(Command cmd) {
        this.history.add(cmd); // optional 
        cmd.execute();
    }
}
