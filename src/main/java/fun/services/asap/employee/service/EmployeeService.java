package fun.services.asap.employee.service;

import fun.services.asap.employee.entity.Employee;
import fun.services.asap.employee.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // make a db call -> for employee 100001 from here(in service class) and not from controller for security reasons.
    public Employee getEmployeeById(int id){
        Employee employee = employeeRepository.findById(id).get();

        return employee;
    }

}
