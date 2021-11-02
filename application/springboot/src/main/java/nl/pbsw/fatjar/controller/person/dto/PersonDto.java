package nl.pbsw.fatjar.controller.person.dto;

import nl.pbsw.fatjar.domain.Address;
import nl.pbsw.fatjar.domain.Person;

public class PersonDto {
    private final Person person;
    private final Address address;

    public PersonDto(Person person, Address address) {
        this.person = person;
        this.address = address;
    }

    public Person getPerson() {
        return person;
    }

    public Address getAddress() {
        return address;
    }
}
