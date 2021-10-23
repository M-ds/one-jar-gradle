package nl.pbsw.onejar.person.impl;

import nl.pbsw.onejar.domain.Address;
import nl.pbsw.onejar.domain.Person;
import nl.pbsw.onejar.person.PersonService;

public class PersonServiceImpl implements PersonService {

    @Override
    public PersonWithAddress getPersonWithAddress(String personId) {
        Person person = createRandomPerson();
        Address address = createRandomAddress();
        return new PersonWithAddress(person, address);
    }

    private Person createRandomPerson() {
        return new Person.Builder()
                .setFirstName("Chris")
                .setLastName("Bouwer")
                .setAge(10)
                .build();
    }

    private Address createRandomAddress() {
        return new Address.Builder()
                .setCity("Hulst")
                .setPostalCode("4543AG")
                .setStreetName("Straatnaam")
                .setStreetNumber(8)
                .build();
    }
}
