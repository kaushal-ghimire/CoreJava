package examplepackageinterface.service;

import examplepackageinterface.entity.Teacher;

public interface TeacherService {


    //save student details
    void save(Teacher teacher);

    Teacher getTeacherDetailByName(String name);

    void deleteTeacherDetailByName(String name);

}
