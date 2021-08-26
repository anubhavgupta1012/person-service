package com.client.person.service.impl;

import com.client.person.pojo.Person;
import com.client.person.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public void publishPerson(Person person) {
        String topic = "person-" + UUID.randomUUID().toString();
        System.out.println(person.toString() + "\tPublishing");
        //restTemplate.postForEntity("http://{ip}:{port}/{topic}/publish", person, Boolean.class);
    }

    @Override
    public boolean consumePerson(Person person) {
        System.out.println(person.toString() + "\t subscribing");
        return true;
    }
}
