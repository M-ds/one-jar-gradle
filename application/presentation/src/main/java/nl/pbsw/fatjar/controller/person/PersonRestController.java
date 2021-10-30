package nl.pbsw.fatjar.controller.person;

import nl.pbsw.fatjar.controller.person.dto.PersonDto;
import nl.pbsw.fatjar.controller.person.response.PersonResponse;
import nl.pbsw.fatjar.person.PersonService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/person")
@CrossOrigin("*")
public class PersonRestController {
    private final PersonService personService;

    public PersonRestController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/{id}")
    public PersonResponse getPerson(@PathVariable String id) {
        PersonService.PersonWithAddress personWithAddress = personService.getPersonWithAddress(id);

        PersonDto personDto = convertToDto(personWithAddress);

        return new PersonResponse.Builder()
                .setErrorMessage("")
                .setSucces(true)
                .setPersonDto(personDto)
                .build();
    }

    private PersonDto convertToDto(PersonService.PersonWithAddress personWithAddress) {
        return new PersonDto(
                personWithAddress.getPerson(),
                personWithAddress.getAddress()
        );
    }
}
