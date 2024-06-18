package fun.services.asap.employee.controller;

import fun.services.asap.employee.entity.Employee;
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
    public Employee getEmployeeDetails(@PathVariable("id") int id) {
        //make a db call -> for employee 100001// note that for security purposes do not make any database call logic from the controller, do it from service layer.... hitting dto then entity to get data from repo db using jpa hibernate framework then response back to controller should be through response class different from entity to conceal info not needed into the public retained more securely into the entity class/es
        Employee employeeById = employeeService.getEmployeeById(id);
        return employeeById;
    }

}
