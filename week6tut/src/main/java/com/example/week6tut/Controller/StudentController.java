package com.example.week6tut.Controller;

import com.example.week6tut.Entity.Student;
import com.example.week6tut.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("student")
@Controller
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/add")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);

    }
    @PostMapping("/delete")
    public void deleteStudent(@RequestBody Long id){
        studentService.deleteStudentById(id);

    }
    @PostMapping("/update")
    public void updateStudent(@RequestBody Student student){
        studentService.updateStudent(student.getStudentId(), student);
    }
    @GetMapping("/get")
    public List<Student> getStudent(){
        return studentService.getStudent();
    }
    @GetMapping("/index")
    public String index(){
        return "index";
    }
}
