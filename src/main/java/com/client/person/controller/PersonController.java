package com.client.person.controller;

import com.client.person.pojo.Person;
import com.client.person.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/person")
    public void savePerson(@RequestBody Person person) {
        personService.publishPerson(person);
    }

    @PutMapping("/person")
    public boolean consumePerson(@RequestBody Person person) {
        return personService.consumePerson(person);
    }
}
