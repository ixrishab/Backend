package com.example.demo.Controller;

import com.example.demo.Repository.StudentRepository;
import com.example.demo.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    private final StudentRepository repo;
    public StudentController(StudentRepository repo){
        this.repo = repo;
    }

    @GetMapping
    public List<Student> getStudents() {
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable long id) {

        return repo.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/search")
    public List<Student> searchStudents (@RequestParam String name){
        return  repo.findByName(name);
    }


    @PostMapping
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        Student savedStudent = repo.save(student);
        return ResponseEntity.status(201).body(savedStudent);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudents(@PathVariable long id){
        if(repo.existsById(id)){
            repo.deleteById(id);
            return ResponseEntity.noContent().build();  // 204 No Content
        }
        return ResponseEntity.notFound().build();
    }
    @GetMapping("/age")
    public List<Student> findByAge(@RequestParam int age) {
        return repo.findStudentsOlderThan(age);
    }
}