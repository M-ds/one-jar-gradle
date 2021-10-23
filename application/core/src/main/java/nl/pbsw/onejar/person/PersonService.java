package nl.pbsw.onejar.person;

import nl.pbsw.onejar.domain.Address;
import nl.pbsw.onejar.domain.Person;

public interface PersonService {

    PersonWithAddress getPersonWithAddress(String personId);

    class PersonWithAddress{
        private final Person person;
        private final Address address;


        public PersonWithAddress(Person person, Address address) {
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
}
