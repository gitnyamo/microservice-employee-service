package fun.services.asap.employeeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmployeeController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/employees")//This annotation maps HTTP GET requests to the /employees endpoint to this method. When a client sends a GET request to http://localhost:8080/employees, this method will be invoked.
    public String getEmployee(){//This is the method signature. The method is public and returns a String.
        String address = restTemplate.getForObject("http://localhost:8080/address",String.class);//This line uses restTemplate to make a GET request to another endpoint (http://localhost:8080/address) on the same server. The getForObject method fetches the response body and maps it to a String. The response from the /address endpoint is stored in the address variable.
        return "Name: Kisha Baraka, email: kishab@gmail.com " + address;//This line constructs a response string that includes a hardcoded name and email along with the address fetched from the /address endpoint. This concatenated string is then returned as the response to the original GET request to /employees.
    }

}
