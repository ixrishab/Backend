package com.example.demo.controller;

import com.example.demo.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private static List<Student> students = new ArrayList<>();

    static {
        students.add(new Student(1, "Abhishek", 20));
        students.add(new Student(2, "Snehith", 21));
        students.add(new Student(3, "Amogh", 22));
    }

    @GetMapping
    public ResponseEntity<List<Student>> getStudents() {
        return ResponseEntity.ok(students);
    }
    //Task - 3
    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return ResponseEntity.ok(student);
            }
        }
        return ResponseEntity.notFound().build();
    }
    //Task - 4
    @GetMapping("/search")
    public ResponseEntity<List<Student>> searchStudents(
            @RequestParam(required = false, defaultValue = "") String name) {

        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                result.add(student);
            }
        }

        if (result.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(result);
    }

    //Task - 5
    @PostMapping
    public ResponseEntity<Student> addStudent(@RequestBody Student student) {
        students.add(student);
        return ResponseEntity.status(201).body(student);
    }
    //Task - 6
    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable int id , @RequestBody Student updatedStudent){
        for(Student student : students){
            if(student.getId() == id){
                student.setName(updatedStudent.getName());
                student.setAge((updatedStudent.getAge()));
                return ResponseEntity.ok(student);
            }
        }
        return ResponseEntity.notFound().build();
    }
    //Task-7
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudents(@PathVariable int id){
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()){
            Student student = iterator.next();
            if(student.getId() == id){
                iterator.remove();
                return ResponseEntity.noContent().build();
            }
        }
        return ResponseEntity.notFound().build();
    }
}