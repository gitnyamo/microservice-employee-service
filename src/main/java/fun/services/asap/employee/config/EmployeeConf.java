package fun.services.asap.employee.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class EmployeeConf {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
