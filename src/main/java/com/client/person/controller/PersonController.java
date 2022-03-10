package com.client.person.controller;

import com.client.person.pojo.Person;
import com.client.person.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/")
    public String publish() {
        return "Hi This side Anubhav";
    }

    @GetMapping("/anubhav")
    public String publish2() {
        return "Hi This side Anubhav, Publish 2";
    }

    @PostMapping("/person")
    public ResponseEntity<Boolean> publish(@RequestBody Person person) {
        return personService.publish(person);
    }

    @PostMapping("/{uuid}/person")
    public ResponseEntity<Boolean> subscribe(@RequestBody Person person, @PathVariable String uuid) {
        return personService.subscribe(person, uuid);
    }
}
