/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Decorator;

/**
 *
 * @author Martin
 */
public class DecoratorTest {

    public static void Test() {
        Window window = new SimpleWindow();
        System.out.println(window.getDescription());

        window = new HorizontalScrollBarDecorator(window);
        System.out.println(window.getDescription());

        window = new VerticalScrollBarDecorator(window);
        System.out.println(window.getDescription());
    }
}
