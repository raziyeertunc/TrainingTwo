package com.example.deneme.Service;

import com.example.deneme.Dao.StudentDao;
import com.example.deneme.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;

    public Collection<Student> getAllStudents() {
        return this.studentDao.getAllStudents();

    }
    public Student getStudentById(int id){
        return this.studentDao.getStudentById(id);
}

    public Student deleteStudentById(int id) {
        return this.studentDao.deleteStudentById(id);

    }
    public void  updateStudent(Student student){
        this.studentDao.updateStudent(student);
    }

    public void insertStudent(Student student) {
        this.studentDao.insertStudentToDb(student);
    }
}