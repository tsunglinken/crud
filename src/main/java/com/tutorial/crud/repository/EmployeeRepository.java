package com.tutorial.crud.repository;

import com.tutorial.crud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 定義對資料表操作的方法
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
