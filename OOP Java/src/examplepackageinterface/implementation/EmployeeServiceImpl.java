package examplepackageinterface.implementation;

import examplepackageinterface.entity.Employee;
import examplepackageinterface.service.EmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {


    @Override
    public void save(Employee employee) {
        System.out.println("Saving Data....");
        System.out.println("Employee Details: "+employee.toString());
    }

    @Override
    public Employee getEmployeeDetailsByName(String name) {
        System.out.println("get employee details...");
        if(name.equals("Rimesh Sapkota")){

         return new Employee("Rimesh Sapkota",21,"Male");

        }
        else{
            return new Employee("Junu",20,"Female");
        }

    }

    @Override
    public Integer getEmployeeAgeByName(String name) {
        if(name.equals("Rimesh Sapkota")){
//            Employee employee = new Employee("Rimesh Sapkota",21 ,"Male");
//            return employee.getAge();
            return 21;
        }else {
            return null;
        }


    }

    @Override
    public Employee getEmployeeDetailsByAge(Integer age) {
        if(age.equals(21)){
            Employee employee = new Employee("Rimesh Sapkota", 21, "Male");
                    return employee;

        }
        else{
            return null;
        }

    }

    @Override
    public List<Employee> getAllEmployees() {
        return null;
    }


}
