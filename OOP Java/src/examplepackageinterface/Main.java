package examplepackageinterface;

import examplepackageinterface.entity.Employee;
import examplepackageinterface.implementation.EmployeeServiceImpl;
import examplepackageinterface.service.EmployeeService;

import examplepackageinterface.entity.Admin;
import examplepackageinterface.implementation.AdminServiceImplementation;
import examplepackageinterface.service.AdminService;

public class Main {

    public static void main(String[] args) {
        EmployeeService empservice = new EmployeeServiceImpl();

        Employee emp = new Employee();
        emp.setName("Rimesh Sapkota");
        emp.setAge(21);
        emp.setGender("Male");

        empservice.save(emp);
//        Employee emp1 = empservice.getEmployeeDetailsByName("Rimesh Sapkota");
//        System.out.println("Employee Details: " + emp1.toString());
//        Employee employeeDetailsByAge = empservice.getEmployeeDetailsByAge(21);
//        System.out.println(employeeDetailsByAge.toString());

        Integer employeeAge = empservice.getEmployeeAgeByName("Rimesh Sapkota");
        System.out.println("Employee age: " + employeeAge);

        System.out.println("---------------------------------------------");

        System.out.println("ADMIN PANEL...");

        AdminService adminService = new AdminServiceImplementation();

        Admin admin = new Admin();
        admin.setName("Principal");
        admin.setAge(45);
        admin.setAddress("Biratnagar");
        admin.setGender("Female");


        adminService.save(admin);
//      System.out.println("Details: " +adminService.getAdminDetailsByName("VP").toString());
        Admin adminDetailsByName = adminService.getAdminDetailsByName("VP");
        System.out.println("Details: " + adminDetailsByName.toString());

        System.out.println("Age: " + adminService.getAdminAgeByName("kaushal"));


    }
}
