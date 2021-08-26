package com.client.person.service;


import com.client.person.pojo.Person;
import org.springframework.http.ResponseEntity;

public interface PersonService {

    ResponseEntity<Boolean> publish(Person person);

    ResponseEntity<Boolean> subscribe(Person person, String uuid);
}
