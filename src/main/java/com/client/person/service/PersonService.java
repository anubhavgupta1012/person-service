package com.client.person.service;


import com.client.person.pojo.Person;

public interface PersonService {

    void publishPerson(Person person);

    boolean consumePerson(Person person);
}
