package fun.services.asap.employee.service;

import fun.services.asap.employee.entity.Employee;
import fun.services.asap.employee.repo.EmployeeRepository;
import fun.services.asap.employee.response.EmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // change return type from Employee to employeeResponse before you can make any call from the controller for the methods in here.
    public EmployeeResponse getEmployeeById(int id){
        // make a db call to get an employee object here in the service layer then use the employee to set or map variables from employee entity class after making the db call before you can return the db call.
        Employee employee = employeeRepository.findById(id).get();
        // get employee object then -> convert to employeeResponse to set the fields  then make calls inside the response using the employee object..... note: what you do here is convert employee to employeeResponse before the call from controller to avoid exposing the entity
        EmployeeResponse employeeResponse = new EmployeeResponse();
        employeeResponse.setId(employee.getId());
        employeeResponse.setFirstName(employee.getLastName());
        employeeResponse.setLastName(employee.getLastName());
        employeeResponse.setEmail(employee.getEmail());
        employeeResponse.setAge(employee.getAge());
        employeeResponse.setGender(employee.getGender());

        //return employeeResponse back instead of employee
        return employeeResponse;
    }

}
