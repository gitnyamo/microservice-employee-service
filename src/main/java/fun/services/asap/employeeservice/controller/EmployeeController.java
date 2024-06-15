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
        //get the data from address service by hitting the address url:http://localhost:8080/address
        //make an external REST API call
        //In order to make a hit to the address server I need a REST Client. To make this call, we need a rest client
        // and this case here, we will be using a rest client called REST Template
        //Now that I have autowired the restTemplate, I will use the restTemplate to get me the address url and get the string data using the string.class
        //For RestTemplate to work please create a bean for the RestTemplate in the config folder for the it to be autowired and work. Note that RestTemplate is getting deprecated now
        String address = restTemplate.getForObject("http://localhost:8080/address",String.class);// use Rest Template to get the string data and once you get that assign that data to my address variable
        //return address data along with the employee data
        return "Name: Kisha Baraka, email: kishab@gmail.com " + address;// Finally, making the call by concatenating the address variable where the data is stored getting the data
        //after all is done, go to the browser or postman and use the employee endpoing to make the call....http://localhost:8081/employees and you will see that you will now get the employee and address call details.
        // in this case... Name: Kisha Baraka, email: kishab@gmail.com 687 Nashville TN //// hard coded details for now for simple understanding
    }

}
