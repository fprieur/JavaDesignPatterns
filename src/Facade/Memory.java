/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author Martin
 */
class Memory {

    public void load(long position, byte[] data) {
        System.out.println("Memory : load positon : " + position + " data : " + data);
    }
}
