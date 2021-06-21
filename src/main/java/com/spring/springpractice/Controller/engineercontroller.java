package com.spring.springpractice.Controller;

import com.spring.springpractice.model.engineer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class engineercontroller
{
    ArrayList<engineer>enggList=new ArrayList<>();

    @RequestMapping("/engineer")
    public String engineer_name()
    {
        engineer engg=new engineer("Abhishek",25,"Computer Science");
        return engg.getName();
    }

    @RequestMapping("/engineerlist")
    public ArrayList<engineer> engineer_list()
    {
        engineer engg=new engineer("Ankur",25,"Civil");
        engineer engg1=new engineer("Amita",25,"Electrical");
        engineer engg2=new engineer("Abhishek",25,"Mechanical");
        enggList.add(engg);
        enggList.add(engg1);
        enggList.add(engg2);
        return enggList;
    }

    @RequestMapping("/lastengineer")
    public engineer get_last_engineer()     //here we declare datatype as engineer (non-primitive)
    {
      return enggList.get(enggList.size()-1);
    }

}
