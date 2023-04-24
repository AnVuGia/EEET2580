package com.example.week6tut.Service;

import com.example.week6tut.Entity.Student;

import java.util.List;

public interface StudentService {
    public void addStudent(Student student);
    public void deleteStudentById(Long id);
    public void updateStudent(Long id, Student student);
    public List<Student> getStudent();
}
