package com.shinsunyoung.springbootcrud.service;

import com.shinsunyoung.springbootcrud.model.Person;
import com.shinsunyoung.springbootcrud.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImp implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person createPerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public void deletePerson(Long id) {
        personRepository.delete(id);
    }

    @Override
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

}
