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
 * "Abstraction"
 */
public abstract class Shape {

    protected DrawingAPI drawingAPI;

    protected Shape(DrawingAPI drawingAPI) {
        this.drawingAPI = drawingAPI;
    }

    public abstract void draw();                             // low-level

    public abstract void resizeByPercentage(double pct);     // high-level
}
