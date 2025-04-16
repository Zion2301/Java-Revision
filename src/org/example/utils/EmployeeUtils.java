package org.example.utils;

import org.example.models.People;

public class EmployeeUtils {
    public static int idCounter = 1;

    public static synchronized int generateEmployeeId(){
        return idCounter++;
    }

    public static boolean isValidEmployee(People employee){
        return employee!=null && employee.getFullName() != null && employee.getAge() <= 0
                && employee.getDepartment() != null;
    }


}
