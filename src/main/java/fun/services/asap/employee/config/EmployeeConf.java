package fun.services.asap.employee.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration// makes dispatcher servelet to create the Beans whenever called for use.
public class EmployeeConf {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean
    public ModelMapper modelMapper(){// model mapper bean is a third part api and not created by spring so no spring model mapper bean injection.
        return new ModelMapper();// created to be used for modelMapping instead of the setters of field.
    }
}
