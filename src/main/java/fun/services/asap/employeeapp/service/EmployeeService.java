package fun.services.asap.employeeapp.service;

import fun.services.asap.employeeapp.entity.Employee;
import fun.services.asap.employeeapp.repo.EmployeeRepository;
import fun.services.asap.employeeapp.response.EmployeeResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;//note that without creating the bean the app will fail because bean will not be automatically created since it is not with spring...

    @Autowired
    private ModelMapper modelMapper;

    public EmployeeResponse getEmployeeById(int id) {
        Employee employee = employeeRepository.findById(id).get();
        EmployeeResponse employeeResponse = modelMapper.map(employee, EmployeeResponse.class);
        return employeeResponse;
    }

}
