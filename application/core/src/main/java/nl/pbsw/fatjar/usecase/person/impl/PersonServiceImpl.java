package nl.pbsw.fatjar.usecase.person.impl;

import nl.pbsw.fatjar.StringUtils;
import nl.pbsw.fatjar.domain.Address;
import nl.pbsw.fatjar.domain.Person;
import nl.pbsw.fatjar.usecase.person.PersonService;

public class PersonServiceImpl implements PersonService {

    @Override
    public PersonWithAddress getPersonWithAddress(String personId) {
        boolean isEmpty = StringUtils.isEmpty(personId);
        if (isEmpty) return null;
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
