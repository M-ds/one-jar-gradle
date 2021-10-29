package nl.pbsw.fatjar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "nl.pbsw.fatjar")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
