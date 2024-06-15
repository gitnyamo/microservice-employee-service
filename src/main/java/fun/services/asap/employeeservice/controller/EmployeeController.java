package fun.services.asap.employeeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmployeeController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/employees")
    public String getEmployee(){
        String address = restTemplate.getForObject("http://localhost:8080/address",String.class);
        return "Name: Kisha Baraka, email: kishab@gmail.com " + address;
        // employee service is now internally connected with the address service and fetching the address service data by making a call using the restTemplate
    }

}
