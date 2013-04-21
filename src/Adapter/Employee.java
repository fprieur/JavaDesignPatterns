/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author Martin
 */
public class Employee implements IEmployee {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void ShowHappiness() {
        System.out.println("Employee " + this.name + " showed happiness");
    }
}
