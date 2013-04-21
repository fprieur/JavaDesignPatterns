/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Martin
 */
public class AdapterTest {

    public static void Test() {
        List<IEmployee> list = new ArrayList<>();
        list.add(new Employee("Tom"));
        list.add(new Employee("Jerry"));
        list.add(new ConsultantToEmployeeAdapter("Bruno"));  //consultant from existing class

        for (IEmployee employee : list) {
            employee.ShowHappiness();
        }
    }
}
