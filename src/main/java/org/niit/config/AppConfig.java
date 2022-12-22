package org.niit.config;

import org.niit.domain.Department;
import org.niit.domain.Employee;
import org.springframework.context.annotation.Bean;

public class AppConfig {

//    @Bean("emp")
    @Bean
    public Employee getEmployee(){
        Employee emp = new Employee();
        emp.setEmpId(100);
        emp.setEmployeeName("Robert");
        return  emp;
    }

    @Bean ("dept1")
    public Department getDepartment(){
        return new Department(12,"Sales");
    }


     @Bean("dept2")
    public Department getDepartment1(){
        return new Department(15,"Human Resources");
    }

}
