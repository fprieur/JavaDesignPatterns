/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author Martin
 */
// abstract decorator class - note that it extends Window
abstract class WindowDecorator extends Window {

    protected Window decoratedWindow; // the Window being decorated

    public WindowDecorator(Window decoratedWindow) {
        this.decoratedWindow = decoratedWindow;
    }

    public void draw() {
        decoratedWindow.draw(); //delegation
    }

    public String getDescription() {
        return decoratedWindow.getDescription(); //delegation
    }
}
