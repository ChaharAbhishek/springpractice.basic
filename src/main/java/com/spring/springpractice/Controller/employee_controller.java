package com.spring.springpractice.Controller;

import com.spring.springpractice.model.employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class employee_controller
{
    @RequestMapping("/get_emp_name")    //here we return employee name only.
public String get_emp_name()
{
    employee emp=new employee("Abhishek",25,"Computer Science");
    return emp.getName();
}

    @RequestMapping("/get_employee")    //here we return employee details completely
    public employee getemployee()   //datatype is employee because we return the employee class details
    {
        employee emp=new employee("Abhishek",25,"Computer Science");
        return emp;
    }

    @RequestMapping("/get_emplist")
    public List<employee> get_employeelist()
    {
        employee emp=new employee("Abhishek",25,"Computer Science");
        employee emp1=new employee("Amit",27,"IT");
        employee emp2=new employee("Amita",28,"Computer");
        List<employee> empList=new ArrayList<>();
        empList.add(emp);
        empList.add(emp1);
        empList.add(emp2);
        return empList;
    }

    @RequestMapping("/add_employee")
    public String add_employee()
    {
        employee emp=new employee("Dhruv",25,"CS");
        List<employee> empList=new ArrayList<>();
        empList.add(emp);
        return emp.getName()+"Added successfully";
    }
}
