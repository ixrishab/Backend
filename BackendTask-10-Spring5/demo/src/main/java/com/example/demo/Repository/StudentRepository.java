package com.example.demo.Repository;

import com.example.demo.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByName(String name);
    @Query("SELECT s FROM Student s WHERE s.age > :age")
    List<Student> findStudentsOlderThan(int age);
}
