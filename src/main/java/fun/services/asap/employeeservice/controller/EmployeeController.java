package fun.services.asap.employeeservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/employees")
    public String getEmployee(){
        //get the data from address service by hitting the address url:http://localhost:8080/address
        //make an external REST API call
        //In order to make a hit to the address server I need a REST Client. To make this call, we need a rest client
        // and this case here, we will be using a rest client called REST Template
        String address = null;// initialized with null here at the moment.
        //return address data along with the employee data
        return "Name: Kisha Baraka, email: kishab@gmail.com " + address;
    }

}
