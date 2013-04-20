/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author Martin
 */
class WinFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WinButton();
    }
}
