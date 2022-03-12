package com.client.person.controller;

import com.client.person.pojo.Person;
import com.client.person.service.PersonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/")
    public String publish() {
        String s = "Hi This side Anubhav after deployment";
        log.info(s);
        return s;

    }

    @GetMapping("/anubhav")
    public String publish2() {
        String s = "Hi This side Anubhav, Publish 2 after deployment";
        log.info(s);
        return s;
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
