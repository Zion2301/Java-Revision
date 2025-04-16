package org.example.interfaces;

import org.example.models.People;

import java.util.List;

public interface IPeople {
    public People addPeople(People people);
    People getPeople (int id);
    boolean updatePerson (People people, int id);
    String deletePerson();
    List<People> listPerson();
}
