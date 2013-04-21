/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor;

/**
 *
 * @author Martin
 */
public interface CarElement {

    void accept(CarElementVisitor visitor); // CarElements have to provide accept().
}
