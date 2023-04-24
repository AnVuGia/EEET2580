package com.example.week6tut.Service;

import com.example.week6tut.Entity.Student;
import com.example.week6tut.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImp implements StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Override
    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    }

    @Override
    public void updateStudent(Long id, Student student) {
        Student student1 = studentRepository.findById(id).get();
        student1.setStudentName(student.getStudentName());
        student1.setStudentEmail(student.getStudentEmail());
        student1.setStudentAddress(student.getStudentAddress());
        student1.setStudentPhone(student.getStudentPhone());
        student1.setStudentDOB(student.getStudentDOB());
        studentRepository.save(student1);

    }

    @Override
    public List<Student> getStudent() {
        return studentRepository.findAll();
    }
}
