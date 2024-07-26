package com.Streamers.JPAStreamers.repository;

import com.Streamers.JPAStreamers.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repo extends JpaRepository<Employee, Long> {
}
