package com.shinsunyoung.springbootcrud.service;

import com.shinsunyoung.springbootcrud.model.Person;
import com.shinsunyoung.springbootcrud.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
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
    public Person getPerson(Long id) {
        return personRepository.findOne(id);
    }
    @Override
    public Person editPerson(Person person) {
        return personRepository.save(person);
    }
    @Override
    public void deletePerson(Person person) {
        personRepository.delete(person);
    }
    @Override
    public void deletePerson(Long id) {
        personRepository.delete(id);
    }
    @Override
    public List<Person> getAllPersons(int pageNumber, int pageSize) {
        return personRepository.findAll(new PageRequest(pageNumber, pageSize)).getContent();
    }
    @Override
    public List<Person> getAllPersons() {
        return personRepository.findAll();
    }

}
