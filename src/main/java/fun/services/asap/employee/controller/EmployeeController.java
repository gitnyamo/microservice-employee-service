package fun.services.asap.employee.controller;

import fun.services.asap.employee.response.EmployeeResponse;
import fun.services.asap.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;


@RestController
public class EmployeeController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees/{id}")
    public ResponseEntity<EmployeeResponse> getEmployeeDetails(@PathVariable("id") int id) {
        EmployeeResponse employeeResponseById = employeeService.getEmployeeById(id);
        return ResponseEntity.status(HttpStatus.OK).body(employeeResponseById);
    }

}
