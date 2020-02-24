package me.wheelchen.repository;

import me.wheelchen.entity.Student;

import java.util.Collection;

/**
 * @author Kelvin Chen
 * @date 2019-11-05 00:58:28
 */
public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
