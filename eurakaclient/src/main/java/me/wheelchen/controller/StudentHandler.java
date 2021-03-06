package me.wheelchen.controller;

import me.wheelchen.entity.Student;
import me.wheelchen.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author Kelvin Chen
 * @date 2019-11-05 01:12:37
 */
@RestController
@RequestMapping("/student")
public class StudentHandler {

    @Value("${server.port}")
    private String port;

    private final StudentRepository studentRepository;

    public StudentHandler(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return studentRepository.findAll();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id) {
        return studentRepository.findById(id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student) {
        studentRepository.saveOrUpdate(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student) {
        studentRepository.saveOrUpdate(student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id) {
        studentRepository.deleteById(id);
    }

    @GetMapping("/index")
    public String index(){
        return "当前端口为： " + port;
    }
}
