package com.Streamers.JPAStreamers.controller;

import com.Streamers.JPAStreamers.model.Employee;
import com.Streamers.JPAStreamers.repository.Repo;
import com.speedment.jpastreamer.application.JPAStreamer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/v1")
public class StreanControl {

    @Autowired
    private Repo repo;

    private JPAStreamer jpaStreamer;

    @Autowired
    public StreanControl(final JPAStreamer jpaStreamer) {
        this.jpaStreamer = jpaStreamer;
    }
    @GetMapping("/groupById")
    public Map<String, List<Employee>> groupbyEmployeeByCity() {
        return jpaStreamer.stream(Employee.class)
                .collect(Collectors.groupingBy(Employee::getCity));
    }
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
