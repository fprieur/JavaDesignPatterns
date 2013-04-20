/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author Martin
 */
class OSXFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new OSXButton();
    }
}
