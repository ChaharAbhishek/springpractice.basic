package com.spring.springpractice.Controller;

import com.spring.springpractice.model.doctor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class cruddoctor {
    List<doctor> docList=new ArrayList<>();
    @RequestMapping("/initial_doctor_list")
    public List<doctor> doctorlist()
    {
        doctor doc=new doctor("Ankur",25,"Lungs");
        doctor doc1=new doctor("Dhruv",25,"Heart");
        doctor doc2=new doctor("Munna",25,"Eyes");
        docList.add(doc);
        docList.add(doc1);
        docList.add(doc2);
        return  docList;
    }

    @RequestMapping("/add_doc")
    public String create()
    {
        doctor doc3=new doctor("kshitiz",26,"kidney");
        docList.add(doc3);
        return doc3.getName()+"Added Successfully";
    }

    @RequestMapping("/all_doctor")
    public List<doctor> get_all_doctor()
    {
        return docList;
    }

    @RequestMapping("/update_doc")
    public String update() //update end points
    {
        docList.get(0).setName("Ankush");
        return "Name updated successfully to Ankush";
    }

    @RequestMapping("/delete_doc")
    public String remove() //delete end points
    {
        docList.remove(0);
        return "Doctor deleted successfully";
    }

}