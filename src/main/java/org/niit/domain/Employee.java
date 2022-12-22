package org.niit.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

    private int empId;
    private  String employeeName;

    @Autowired
    @Qualifier("dept2")
    private Department department;

    public Employee(int empId, String employeeName, Department department) {
        this.empId = empId;
        this.employeeName = employeeName;
        this.department = department;
    }

    public Employee() {

    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", employeeName='" + employeeName + '\'' +
                ", department=" + department +
                '}';
    }
}
