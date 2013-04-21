/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author Martin
 */
class CPU {

    public void freeze() {
        System.out.println("CPU: freeze");
    }

    public void jump(long position) {
        System.out.println("CPU: jump to position : " + position);
    }

    public void execute() {
        System.out.println("CPU: execute");
    }
}
