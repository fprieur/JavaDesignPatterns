/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author Martin
 */
public class AbstractFactoryTest {

    public static void Test() {
        Application application = new Application(createOsSpecificFactory());
    }

    /**
     *
     * @return
     */
    public static GUIFactory createOsSpecificFactory() {
        int sys = readFromConfigFile("OS_TYPE");
        if (sys == 0) {
            return new WinFactory();
        } else {
            return new OSXFactory();
        }
    }

    private static int readFromConfigFile(String os_type) {
        return 1;
    }
}
