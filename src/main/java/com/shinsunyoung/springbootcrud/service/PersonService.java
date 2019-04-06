package com.shinsunyoung.springbootcrud.service;

import com.shinsunyoung.springbootcrud.model.Person;

import java.util.List;

public interface PersonService {
    Person createPerson(Person person);
    void deletePerson(Long id);
    List<Person> getAllPersons();
}
