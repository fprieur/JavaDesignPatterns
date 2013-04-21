/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author Martin
 */
//existing class does not need to be changed
public class Consultant {

    private String name;

    public Consultant(String name) {
        this.name = name;
    }

    protected void ShowSmile() {
        System.out.println("Consultant " + this.name + " showed smile");
    }
}
