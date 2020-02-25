package me.wheelchen.feign.impl;

import me.wheelchen.entity.Student;
import me.wheelchen.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author Kelvin Chen
 * @date 2020-02-24 23:58:42
 */
@Component
public class FeignError implements FeignProviderClient{
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中......";
    }
}
