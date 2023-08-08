package pl.thermo.thermo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:db-postgres.properties")
@SpringBootApplication
public class ThermoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThermoApplication.class, args);
	}

}
