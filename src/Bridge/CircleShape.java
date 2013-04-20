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
 * "Refined Abstraction"
 */
public class CircleShape extends Shape {

    private double x, y, radius;

    public CircleShape(double x, double y, double radius, DrawingAPI drawingAPI) {
        super(drawingAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // low-level i.e. Implementation specific
    @Override
    public void draw() {
        drawingAPI.drawCircle(x, y, radius);
    }
    // high-level i.e. Abstraction specific

    @Override
    public void resizeByPercentage(double pct) {
        radius *= pct;
    }
}
