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

        public EmployeeResponse getEmployeeById(int id){
        Employee employee = employeeRepository.findById(id).get();
        // note that inside here i am doing conversion manually using setters. However, when you have so many fields it can be so hard to do that to resolve this, I will be using ModelMapper moving forward for this app...
        EmployeeResponse employeeResponse = new EmployeeResponse();
        employeeResponse.setId(employee.getId());
        employeeResponse.setFirstName(employee.getLastName());
        employeeResponse.setLastName(employee.getLastName());
        employeeResponse.setEmail(employee.getEmail());
        employeeResponse.setAge(employee.getAge());
        employeeResponse.setGender(employee.getGender());

        return employeeResponse;
    }

}
