/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author Martin
 */
class OSXButton implements Button {

    @Override
    public void paint() {
        System.out.println("I'm an OSXButton");
    }
}
