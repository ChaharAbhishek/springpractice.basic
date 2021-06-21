package com.spring.springpractice.Controller;

import com.spring.springpractice.model.employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class crudcontroller {

    /*
    C-Create : adding resource
    R-Read : get resource
    U-Update : update resource
    D-Delete : remove resource
.
     */
    List<employee> empList=new ArrayList<>();   //class level declared (globally)

    @RequestMapping("/add_emp")
    public String add() //create end points
    {
        employee emp=new employee("amita",25,"CS");
        empList.add(emp);
        return emp.getName()+"Added Successfully";
    }

    @RequestMapping("/get_all_emp")
    public List <employee> getemployeeList() //get end points
    {
        return empList;
    }

    @RequestMapping("/update_emp")
    public String update() //update end points
    {
        empList.get(0).setName("JAVA"); //here we use setter
        return "Name updated successfully to Java";
    }

    @RequestMapping("/delete_emp")
    public String remove() //delete end points
    {
        empList.remove(0);
        return "Employee deleted successfully";
    }
}
