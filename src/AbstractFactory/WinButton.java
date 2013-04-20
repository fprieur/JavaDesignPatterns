/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author Martin
 */
class WinButton implements Button {

    @Override
    public void paint() {
        System.out.println("I'm a WinButton");
    }
}
