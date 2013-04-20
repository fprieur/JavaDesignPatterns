/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge;

/**
 *
 * @author Martin
 */
/**
 * "ConcreteImplementor" 1/2
 */
public class DrawingAPI1 implements DrawingAPI {

    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("API1.circle at %f:%f radius %f\n", x, y, radius);
    }
}
