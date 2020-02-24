package me.wheelchen.controller;

import me.wheelchen.entity.Student;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @author Kelvin Chen
 * @date 2020-02-24 15:54:29
 */
@RestController
@RequestMapping("/consumer")
public class ConsumerHandler {

    private final RestTemplate restTemplate;

    public ConsumerHandler(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return restTemplate.getForEntity("http://localhost:8010/student/findAll", Collection.class).getBody();
    }

    @GetMapping("findAll2")
    public Collection<Student> findAll2() {
        return restTemplate.getForObject("http://localhost:8010/student/findAll", Collection.class);
    }

    /**
     * something wrong makes this request change in https way
     *
     * @param id
     * @return
     */
    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id) {
        return restTemplate.getForEntity("http://localhost:8010/student/findById/{id}", Student.class, id).getBody();
    }

    @GetMapping("/findById2/{id}")
    public Student findById2(@PathVariable("id") long id) {
        return restTemplate.getForObject("http://localhost:8010/student/findById/{id}", Student.class, id);
    }

    @PostMapping("/save")
    public void save(@RequestBody Student student) {
        restTemplate.postForEntity("http://localhost:8010/student/save", student, null).getBody();
    }

    @PostMapping("/save2")
    public void save2(@RequestBody Student student) {
        restTemplate.postForObject("http://localhost:8010/student/save", student, Student.class);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student) {
        restTemplate.put("http://localhost:8010/student/update", student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id) {
        restTemplate.delete("http://localhost:8010/student/deleteById/{id}", id);
    }
}
