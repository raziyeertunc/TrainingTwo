package com.example.deneme.Controller;

import com.example.deneme.Entity.Student;
import com.example.deneme.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Collection;
@RestController
@RequestMapping("/students")

public class StudentController {
    @Autowired

    private StudentService  studentService;
    @RequestMapping(method = RequestMethod.GET)

    public Collection<Student> getAllStudents() {
        return this.studentService.getAllStudents();
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Student getStudentById(@PathVariable("id") int id){
        return this.studentService.getStudentById(id);
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public Student deleteStudentById(@PathVariable("id") int id){
        return  this.studentService.deleteStudentById(id);

    }
    @RequestMapping(method = RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateStudent(@RequestBody Student student){
        studentService.updateStudent(student);
    }
    @RequestMapping(method = RequestMethod.POST,consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertStudent(@RequestBody Student student){
        studentService.insertStudent(student);
    }

}