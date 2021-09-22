package com.torryharris.driver;

import com.torryharris.model.Employee;
import com.torryharris.model.Manager;

public class EmployeeDemo {
    public static void main(String[] args) {
        /*Employee e1 = new Employee("Ram",1001,"Manager",50000.0f);
        Employee e2 = new Employee("Shyam",1002,"Lead",40000.0f);
        Employee e3 = new Employee("Krishna",1003,"HR",35000.0f);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);*/

        Manager mgr = new Manager("Amar",1010,"Project Manager",70000,"Cloud Upload",4);
        System.out.println(mgr);
        mgr.callMeeting();

    }
}
