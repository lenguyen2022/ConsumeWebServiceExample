package ca.sheridancollege.lenguyen.consumewebservice.controllers;

import ca.sheridancollege.lenguyen.consumewebservice.beans.Student;
import ca.sheridancollege.lenguyen.consumewebservice.database.StudentRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/students")
    public List<Student> findAll() {
        return this.studentRepository.findAll();
    }
    @GetMapping("/students/{id}")
    public Student findById(@PathVariable Long id) {
        return this.studentRepository.findById(id).orElse(null);
    }
}
