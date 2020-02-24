package me.wheelchen.controller;

import me.wheelchen.entity.Student;
import me.wheelchen.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @author Kelvin Chen
 * @date 2020-02-24 23:26:56
 */
@RestController
@RequestMapping("/feign")
public class FeignHandler {
    private final FeignProviderClient feignProviderClient;

    public FeignHandler(FeignProviderClient feignProviderClient) {
        this.feignProviderClient = feignProviderClient;
    }

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feignProviderClient.findAll();
    }

    @GetMapping("/index")
    public String index(){
        return feignProviderClient.index();
    }
}
