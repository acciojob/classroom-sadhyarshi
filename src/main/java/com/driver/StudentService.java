package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class StudentService {
    
    @Autowired
    StudentRepository studentrepository ;

    public void addStudent(Student student)
    {
        studentrepository.addStudent(student);
    }

    public void addTeacher(Teacher teacher)
    {
        studentrepository.addTeacher(teacher);
    }

    public void addPair(String student, String teacher)
    {
        studentrepository.addPair(student, teacher);
    }
    
    public Student getStudentByName(String name)
    {
        return studentrepository.getStudentByName(name) ;
    }

    public Teacher getTeacherByName(String name)
    {
        return studentrepository.getTeacherByName(name) ;
    }

    public List<String> getStudentsByTeacher(String name)
    {
        return studentrepository.getStudentsByTeacher(name);
    }

    public List<String> getStudentList()
    {
        return studentrepository.getStudentList() ;
    }

    public void deleteTeacher(String name)
    {
        studentrepository.deleteTeacher(name);
    }

    public void deleteAllTeachers()
    {
        studentrepository.deleteAllTeachers();
    }

}
