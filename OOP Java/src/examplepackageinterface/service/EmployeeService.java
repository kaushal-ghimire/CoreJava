package examplepackageinterface.service;

import examplepackageinterface.entity.Employee;
import java.util.List;

public interface EmployeeService {

    void save(Employee employee);

    Employee getEmployeeDetailsByName(String name);

    Integer getEmployeeAgeByName(String name);

    Employee getEmployeeDetailsByAge(Integer age);

    List<Employee> getAllEmployees();

}
