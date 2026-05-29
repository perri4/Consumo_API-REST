package ar.edu.utn.ba.ddsi.countries.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration //esta clase HABILITA el cliente HTTP por donde vamos a hacer la REQUEST con la API
public class RestTemplateConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
