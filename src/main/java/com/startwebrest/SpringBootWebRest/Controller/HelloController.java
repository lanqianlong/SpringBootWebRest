package com.startwebrest.SpringBootWebRest.Controller;

import com.startwebrest.SpringBootWebRest.DAO.People;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {
    //@RequestMapping(value="/people", method= RequestMethod.GET)
    @GetMapping("/people")
    public List<People> getPeople(){
        People p1 = new People();
        p1.setName("lan");
        p1.setAge(16);
        p1.setAdder("75 dd");

        People p2= new People();
        p2.setName("zhang");
        p2.setAge(16);
        p2.setAdder("74 dd");

        List<People> list = new ArrayList();
        list.add(p1);
        list.add(p2);

        return list;
    }
}
