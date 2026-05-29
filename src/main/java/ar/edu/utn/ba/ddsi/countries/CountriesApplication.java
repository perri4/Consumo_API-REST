package ar.edu.utn.ba.ddsi.countries;

import ar.edu.utn.ba.ddsi.countries.config.RestCountriesProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RestCountriesProperties.class) //esto es IMPORTANTISIMO. Es NECESARIO para que springboot sepa que tiene que ir a instaciar esa clase (Donde se habilita la url api) y hacer toda la configuracion por nosotros.
public class CountriesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CountriesApplication.class, args);
	}

}
