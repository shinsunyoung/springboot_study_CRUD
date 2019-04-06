package com.shinsunyoung.springbootcrud.controller;

import com.shinsunyoung.springbootcrud.model.Person;
import com.shinsunyoung.springbootcrud.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class PersonController {
    @Autowired
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String homePage(Model model) {
        model.addAttribute("person", new Person());
        return "makePerson";
    }

    @RequestMapping(value = "/person", method = RequestMethod.GET)
    public String getPagePerson(Model model) {
        model.addAttribute("persons", personService.getAllPersons());
        return "result";
    }

    @RequestMapping(value = "/person", method = RequestMethod.POST)
    public String addPagePerson(@ModelAttribute Person person, Model model) {
        personService.createPerson(person);
        model.addAttribute("persons", personService.getAllPersons());
        return "result";
    }

    @RequestMapping(value = "/person/delete/{id}")
    public String deletePagePerson(@PathVariable Long id) {
        System.out.println("id=" + id);
        personService.deletePerson(id);
        return "redirect:/person";
    }



}