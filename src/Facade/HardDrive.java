/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

/**
 *
 * @author Martin
 */
class HardDrive {

    public byte[] read(long lba, int size) {
        System.out.println("HardDrive read lba : " + lba + ", size : " + size);
        return new byte[]{1, 2, 3};
    }
}
