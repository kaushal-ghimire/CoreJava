package examplepackageinterface;


import examplepackageinterface.entity.Student;
import examplepackageinterface.implementation.StudentServiceImplementation;
import examplepackageinterface.service.StudentService;

public class MainMethod {


    public static void main(String[] args) {

        Student student = new Student();
        student.setName("Sundar Gautam");
        student.setAge(21);
        student.setGender("Male");


        System.out.println("Name:" + student.getName()+ "," + "Age: "+ student.getAge() + ","
                + "Gender: " + student.getGender());

        StudentService studentservice = new StudentServiceImplementation();

        studentservice.save(student);
        studentservice.getStudentDetailByName("kaushal");
        studentservice.deleteStudentDetailByName("sundar");




    }





}
