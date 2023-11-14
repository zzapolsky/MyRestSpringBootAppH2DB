package ru.itlearn.MyRestSpringBootAppH2DB.controller.students;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.itlearn.MyRestSpringBootAppH2DB.entity.Student;
import ru.itlearn.MyRestSpringBootAppH2DB.service.StudentService;

import java.util.List;


@RequestMapping("/api")
public class MyController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students")
    public List<Student> showAllStudents() {
        List<Student> allStudents = studentService.getAllStudents();
        return allStudents;
    }
    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable("id") int id) {
        return studentService.getStudent(id);
    }

    @PostMapping("/students")
    public String saveStudent(@RequestBody Student student) {

        studentService.saveStudent(student);
        return "Succesful add student";

    }

    @PutMapping ("/students")
    public String updateStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
        return "Succesful save student";
    }

    @DeleteMapping("/student/{id}")
    public void updateStudent(@PathVariable("id") int id) {
        studentService.deleteStudent(id);
    }

}
