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
    private ModelMapper modelMapper;// to further use the model mapper just like RestTemplate we have to create a bean for it and mark the instance method with @Bean and the class for the bean(s) to be marked as @Configuration.. see the class for the beans under the config folder.

    public EmployeeResponse getEmployeeById(int id) {
        //note: here instead of using setters when making a db call from the repository, now use the model mapper to replace the setters... It will be quicker and do once for the object mapping employee entity object to the employeeResponse object instead of each field at a time when using the setters.
        Employee employee = employeeRepository.findById(id).get();
        EmployeeResponse employeeResponse = modelMapper.map(employee, EmployeeResponse.class);//note: here you are mapping from employee as the source class for the employee fields to map to the EmployeeResponse class... work of the model mapper.... swift and easy..  then assign it to the new local variable of the employeeResponse as seen here on this line code.

//        EmployeeResponse employeeResponse = new EmployeeResponse();
//        employeeResponse.setId(employee.getId());
//        employeeResponse.setFirstName(employee.getLastName());
//        employeeResponse.setLastName(employee.getLastName());
//        employeeResponse.setEmail(employee.getEmail());
//        employeeResponse.setAge(employee.getAge());
//        employeeResponse.setGender(employee.getGender());

        return employeeResponse;
    }

}
