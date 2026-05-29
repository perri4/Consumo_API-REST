package ar.edu.utn.ba.ddsi.countries.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "rest-countries") //esto es propio de springBoot. Llama al archivo "application.yml" y se fija ahi, todo lo que hay debajo de un "rest-countries"
@Data //esto basicamente habilita los getters y setter de la clase.    
public class RestCountriesProperties {

    private String baseUrl;
}
