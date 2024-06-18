package fun.services.asap.employee.service;

import fun.services.asap.employee.entity.Employee;
import fun.services.asap.employee.repo.EmployeeRepository;
import fun.services.asap.employee.response.EmployeeResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private ModelMapper modelMapper;

    public EmployeeResponse getEmployeeById(int id) {
        Employee employee = employeeRepository.findById(id).get();
        EmployeeResponse employeeResponse = modelMapper.map(employee, EmployeeResponse.class);
        return employeeResponse;
    }

}
