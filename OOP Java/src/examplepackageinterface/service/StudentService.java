package examplepackageinterface.service;

import examplepackageinterface.entity.Student;

public interface StudentService {

    //save student details
    void save(Student student);

    Student getStudentDetailByName(String name);

    void deleteStudentDetailByName(String name);


}
