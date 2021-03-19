package examplepackageinterface.implementation;

import examplepackageinterface.entity.Student;
import examplepackageinterface.service.StudentService;

public class StudentServiceImplementation implements StudentService {


    @Override
    public void save(Student student) {
        System.out.println("Save Details...");
    }

    @Override
    public Student getStudentDetailByName(String name) {
        System.out.println("Fetch student details...");
        return new Student("kaushal",20,"male");
    }

    @Override
    public void deleteStudentDetailByName(String name) {
        System.out.println("Delete student details...");

    }
}
