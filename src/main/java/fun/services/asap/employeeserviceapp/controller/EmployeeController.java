package fun.services.asap.employeeserviceapp.controller;

import fun.services.asap.employeeserviceapp.response.AddressResponse;
import fun.services.asap.employeeserviceapp.response.EmployeeResponse;
import fun.services.asap.employeeserviceapp.service.EmployeeService;
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

        //addressResponse -> set data by making a rest api call
        AddressResponse addressResponse = new AddressResponse();// right now address object response is still a null object if you make a call it should give you 0 for int value and null for string values of address field, however it should populate the data.

        //employee -> EmployeeResponse
        EmployeeResponse employeeResponse = employeeService.getEmployeeById(id);

        employeeResponse.setAddressResponse(addressResponse);
        return ResponseEntity.status(HttpStatus.OK).body(employeeResponse);
    }

}
