package com.example.deneme.Dao;

import com.example.deneme.Entity.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Collection;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDao {
    private static Map<Integer , Student> students;
    static {
        students = new HashMap<Integer,Student>(){
        {
            put(1,new Student(1,"ali", "computer science"));
            put(2,new Student(2,"fatma", "med"));
            put(3,new Student(3,"ayse", " ie"));

        }
    };
    }
    public Collection<Student> getAllStudents() {
        return this.students.values();
    }
    public Student getStudentById(int id){
        return this.students.get(id);
    }

    public Student deleteStudentById(int id) {
        return this.students.remove(id);
    }
    public void  updateStudent(Student student){
        Student s = students.get(student.getId());
        s.setCourse(student.getCourse());
        s.setName(student.getName());
        students.put(student.getId(),student);
}


    public void insertStudentToDb(Student student) {
        this.students.put(student.getId(),student);
    }
}