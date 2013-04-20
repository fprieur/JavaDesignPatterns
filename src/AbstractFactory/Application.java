/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author Martin
 */
public class Application {

    public Application(GUIFactory factory) {
        Button button = factory.createButton();
        button.paint();
    }
}
