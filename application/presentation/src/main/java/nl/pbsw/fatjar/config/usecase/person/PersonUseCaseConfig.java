package nl.pbsw.fatjar.config.usecase.person;

import nl.pbsw.fatjar.person.PersonService;
import nl.pbsw.fatjar.person.impl.PersonServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonUseCaseConfig {

    @Bean
    public PersonService personService() {
        return new PersonServiceImpl();
    }
}
