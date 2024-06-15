package fun.services.asap.employeeservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/employees")
    public String getEmployee(){
        String address = null;
        //return address data along with the employee data
        return "Name: Kisha Baraka, email: kishab@gmail.com" + address;
    }

}
