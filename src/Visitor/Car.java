/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Visitor;

/**
 *
 * @author Martin
 */
public class Car implements CarElement {

    CarElement[] elements;

    public Car() {
        //create new Array of elements
        this.elements = new CarElement[]{new Wheel("front left"),
            new Wheel("front right"), new Wheel("back left"),
            new Wheel("back right"), new Body(), new Engine()};
    }

    @Override
    public void accept(CarElementVisitor visitor) {
        for (CarElement elem : elements) {
            elem.accept(visitor);
        }
        visitor.visit(this);
    }
}
