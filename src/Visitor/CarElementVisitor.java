/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor;

/**
 *
 * @author Martin
 */
public interface CarElementVisitor {

    void visit(Wheel wheel);

    void visit(Engine engine);

    void visit(Body body);

    void visit(Car car);
}
