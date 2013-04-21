/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor;

/**
 *
 * @author Martin
 */
public class Body implements CarElement {

    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
