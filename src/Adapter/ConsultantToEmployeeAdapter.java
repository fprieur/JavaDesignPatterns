/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author Martin
 */
public class ConsultantToEmployeeAdapter extends Consultant implements IEmployee {

    public ConsultantToEmployeeAdapter(String name) {
        super(name);
    }

    @Override
    public void ShowHappiness() {
        super.ShowSmile();  //call the parent Consultant class
    }
}
