package com.company;

public class PersonTest {
    public void test() {
        Person person = new Person();
        person.setName("Anton");
        person.setPatronymic("Sergeevi4");
        person.setSurname("Losev");
        System.out.println(person.getFIO());

        person.setName("");
        System.out.println(person.getFIO());

        person.setPatronymic("");
        System.out.println(person.getFIO());
    }
}
