package com.Streamers.JPAStreamers.controller;

import com.Streamers.JPAStreamers.model.Employee;
import com.Streamers.JPAStreamers.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class StreanControl {

    @Autowired
    private Repo repo;
    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return repo.save(employee);
    }
    @PostMapping("/add")
    public List<Employee > saveEmployee(@RequestBody List<Employee> employee) {
        return repo.saveAll(employee);

    }

    @GetMapping("/get")
    public List<Employee> getEmployee() {
        return repo.findAll();
    }

}
