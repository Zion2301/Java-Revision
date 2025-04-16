package org.example.serviceImpl;

import org.example.exceptions.EmployeeInvalidDataException;
import org.example.exceptions.EmployeeNotFoundException;
import org.example.interfaces.IPeople;
import org.example.models.People;
import org.example.utils.EmployeeUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeImpl implements IPeople {
 private Map<Integer, People> employeemMan = new HashMap<>();
    @Override
    public People addPeople(People people) {
        if(EmployeeUtils.isValidEmployee(people)){
            throw new EmployeeInvalidDataException();
        }
       int id = EmployeeUtils.generateEmployeeId();
        people.setId(id);
        People employee = employeemMan.put(people.getId(), people);

        return employee;
    }

    @Override
    public People getPeople(int id) {
        People people = employeemMan.get(id);
        if(people == null){
            throw new EmployeeNotFoundException(id);
        }
        return people;
    }

    @Override
    public boolean updatePerson(People people, int id) {
        return false;
    }

    @Override
    public String deletePerson() {
        return "";
    }

    @Override
    public List<People> listPerson() {
        return new ArrayList<>(employeemMan.size());
    }
}
