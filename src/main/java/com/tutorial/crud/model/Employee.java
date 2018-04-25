package com.tutorial.crud.model;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 定義與資料庫資料表名為"EMPLOYEE"映射的物件
 */
@Entity
@Table(name = "EMPLOYEE")
public class Employee implements Serializable{
    private int id;
    private String empCode;
    private String empName;
    private String empEngName;
    private String empStatus;

    public Employee() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "EMP_CODE")
    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    @Basic
    @Column(name = "EMP_NAME")
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Basic
    @Column(name = "EMP_ENG_NAME")
    public String getEmpEngName() {
        return empEngName;
    }

    public void setEmpEngName(String empEngName) {
        this.empEngName = empEngName;
    }

    @Basic
    @Column(name = "EMP_STATUS")
    public String getEmpStatus() {
        return empStatus;
    }

    public void setEmpStatus(String empStatus) {
        this.empStatus = empStatus;
    }

}
