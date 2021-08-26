package com.client.person.pojo;

public class Person {

    private String id;
    private String name;
    private Address address;


    public String getId() {
        return id;
    }

    public Person setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public Address getAddress() {
        return address;
    }

    public Person setAddress(Address address) {
        this.address = address;
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", address=" + address +
            '}';
    }
}
