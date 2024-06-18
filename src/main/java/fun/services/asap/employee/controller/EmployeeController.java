package fun.services.asap.employee.controller;

import fun.services.asap.employee.response.EmployeeResponse;
import fun.services.asap.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;



@RestController
public class EmployeeController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees/{id}")
    //Note that here instead of returning the employee object directly, you will be returning the employeeResponse.
    public EmployeeResponse getEmployeeDetails(@PathVariable("id") int id) {
        EmployeeResponse employeeById = employeeService.getEmployeeById(id);
        return employeeById;
    }

}
