package ar.edu.ies6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "ar.edu.ies6.model")
public class Tp07Grupo4Ies6correctoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tp07Grupo4Ies6correctoApplication.class, args);
    }
}
