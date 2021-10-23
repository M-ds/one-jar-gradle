package nl.pbsw.onejar.config;

import nl.pbsw.onejar.person.PersonService;
import nl.pbsw.onejar.person.impl.PersonServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PersonUseCaseConfig {

    @Bean
    public PersonService initPersonService(){
        return new PersonServiceImpl();
    }
}
